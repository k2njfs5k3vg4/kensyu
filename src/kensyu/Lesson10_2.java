package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lesson10_2 {

	private final String url = "jdbc:postgresql:sample";
	private String user;
	private String pass;

	private int code;
	private String name;
	private int age;
	private String tel;

	public Lesson10_2(String user, String pass) {
		this.user = user;
		this.pass = pass;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getInsertValues() {
		return code + "：" + name + "：" + age + "：" + tel;
	}

	public String insert() {
		String sql = "INSERT INTO emp VALUES(?,?,?,?)";
		int rows = 0;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, code);
			st.setString(2, name);
			st.setInt(3, age);
			st.setString(4, tel);
			rows = st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rows + "件挿入しました。";
	}

	public String getLastRow() {
		String sql = "SELECT * FROM emp";
		String lastRow = "";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {
			while (rs.next()) {
				lastRow = rs.getInt("code") + "：" + rs.getString("name") +
						"：" + rs.getInt("age") + "：" + rs.getString("tel");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lastRow;
	}

}
