package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Lesson10_2 {

	private int code;
	private String name;
	private int age;
	private String tel;

	public Lesson10_2(int code, String name, int age, String tel) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.tel = tel;

	}

	public Lesson10_2() {
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

	public static void main(String[] args) {
		Lesson10_2 lesson = new Lesson10_2(9, "武井", 25, "082-2222-2222");
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "INSERT INTO emp Values(?,?,?,?)";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setInt(1, lesson.getCode());
			st.setString(2, lesson.getName());
			st.setInt(3, lesson.getAge());
			st.setString(4, lesson.getTel());
			int rows = st.executeUpdate();
			System.out.println(rows + "件");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;

	}

}
