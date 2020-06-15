package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectLike {

	private final String user = "student";
	private final String pass = "himitu";
	private final String url = "jdbc:postgresql:sample";

	public String like(String string) {
		String sql = "SELECT * FROM emp where name LIKE ?";
		String str = "";

		try (Connection con = DriverManager.getConnection(this.url, this.user, this.pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.setString(1, "%" + string + "%");

			try (ResultSet rs = st.executeQuery();) {

				while (rs.next()) {
					str += rs.getInt("code") + " : " + rs.getString("name") + " : " + rs.getInt("age") + " : "
							+ rs.getString("tel");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return str;
	}

}
