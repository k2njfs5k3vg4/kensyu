package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lesson10_3 {

	private final String url = "jdbc:postgresql:sample";
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	private String pass;

	public Lesson10_3(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public ArrayList<String> fuzzySerch(String word) throws SQLException {
		ArrayList<String> find = new ArrayList<String>();
		String sql = "SELECT * FROM emp WHERE name LIKE ?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setString(1, word);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				find.add(rs.getInt("code") + "：" + rs.getString("name") +
						"：" + rs.getInt("age") + "：" + rs.getString("tel"));
			}
		} catch (SQLException e) {
			throw new SQLException();
		}

		return find;
	}

}
