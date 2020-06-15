package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lesson10_2 {
	String url = "jdbc:postgresql:sample";
	String user = "student";
	String pass = "himitu";

	public String insertSql(int code, String name, int age, String tel) {
		String sql = "INSERT INTO emp(code,name,age,tel) VALUES(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, code);
			st.setString(2, name);
			st.setInt(3, age);
			st.setString(4, tel);
			int rows = st.executeUpdate();
			System.out.println(rows + "件、データベースに追加しました");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String sql2 = "SELECT * FROM emp where code=?";
		String str = "";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql2);) {
			st.setInt(1, code);
			try (ResultSet rs = st.executeQuery();) {

				while (rs.next()) {
					str = rs.getInt("code") + " : " + rs.getString("name") + " : " + rs.getInt("age") + " : "
							+ rs.getString("tel");
				}
				//				throw new SQLException();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//		return Code + " : " + Name + " : " + Age + " : " + Tel;

		System.out.println(str);
		return str;
	}

}
