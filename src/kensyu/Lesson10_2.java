package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lesson10_2 {
	private final String url = "jdbc:postgresql:sample";
	private final String user = "student";
	private final String pass = "himitu";

	public String insertSql(int code, String name, int age, String tel) {
		String sql = "INSERT INTO emp(code,name,age,tel) VALUES(?,?,?,?)";
		String sql2 = "SELECT * FROM emp where code=?";
		String str = "";

		try (Connection con = DriverManager.getConnection(this.url, this.user, this.pass);
				PreparedStatement st = con.prepareStatement(sql);
				PreparedStatement st2 = con.prepareStatement(sql2);) {

			st.setInt(1, code);
			st.setString(2, name);
			st.setInt(3, age);
			st.setString(4, tel);

			st.executeUpdate();

			st2.setInt(1, code);
			try (ResultSet rs = st2.executeQuery();) {

				while (rs.next()) {
					str = rs.getInt("code") + " : " + rs.getString("name") + " : " + rs.getInt("age") + " : "
							+ rs.getString("tel");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return str;
	}

}
