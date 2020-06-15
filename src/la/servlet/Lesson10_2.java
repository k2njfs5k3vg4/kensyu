package la.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Lesson10_2 {

	private int num;
	private String name;
	private int year;
	private String phonenum;

	public Lesson10_2(int i, String string, int j, String string2) {
		this.num = i;
		this.name = string;
		this.year = j;
		this.phonenum = string2;
	}

	public String insert() {
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "INSERT INTO emp(code,name,age,tel) VALUES(" + num + ",'" + name + "'," + year + ",'" + phonenum
				+ "')";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			Class.forName("org.postgresql.Driver");
			int rows = st.executeUpdate();
			return rows + "件、データベースに追加しました。";
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

}
