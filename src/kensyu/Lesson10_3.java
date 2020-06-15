package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lesson10_3 {

	private int code;
	private String name;
	private int age;
	private String tel;
	private String like;


	public Lesson10_3(int code, String name, int age, String tel) {
		this.code = code;
		this.name = name;
		this.age = age;
		this.tel = tel;

	}

	public Lesson10_3() {
	}

	public Lesson10_3(String like) {
		this.setLike(like);
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
		Lesson10_3 lesson = new Lesson10_3("木");
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp WHERE name LIKE ?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setString(1, "%"+lesson.getLike()+"%");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("code") + "：");
				System.out.print(rs.getString("name") + "：");
				System.out.print(rs.getInt("age") + "：");
				System.out.println(rs.getString("tel"));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;

	}

	public String getLike() {
		return like;
	}

	public void setLike(String like) {
		this.like = like;
	}
}
