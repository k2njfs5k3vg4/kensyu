package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_2Test extends Lesson10_2 {

	@Test
	void test() {
		Lesson10_2 lesson = new Lesson10_2(9, "武井", 25, "082-2222-2222");
		Assertions.assertEquals(9, lesson.getCode());
	}

	@Test
	void test1() {
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
			//			int rows = st.executeUpdate();
			Assertions.assertEquals("INSERT INTO emp Values(9,'武井',25,'082-2222-2222')", st.toString());
		} catch (SQLException e) {
			fail();
			e.printStackTrace();
		}
		return;
	}

}
