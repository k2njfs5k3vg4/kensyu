package kensyu;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_1Test extends Lesson10_1 {

	@Test
	void test() {
		Lesson10_1 lesson = new Lesson10_1(9, "武井", 25, "082-2222-2222");
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(lesson.getSql());) {
			Assertions.assertEquals("INSERT INTO emp VALUES(9,武井,25,082-2222-2222)", st.toString());

		} catch (SQLException e) {
			fail();
			e.printStackTrace();
		}
		return;
	}

	@Test
	void test1() {
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp ORDER by age";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {
			rs.next();
			Assertions.assertEquals(23, rs.getInt("age"));
			rs.next();
			Assertions.assertEquals(25, rs.getInt("age"));
			rs.next();
			Assertions.assertEquals(28, rs.getInt("age"));
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return;
	}

}
