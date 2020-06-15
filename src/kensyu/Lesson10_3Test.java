package kensyu;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Lesson10_3Test extends Lesson10_3 {

	@Test
	void test() {
		Lesson10_3 lesson = new Lesson10_3("木");
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp WHERE name LIKE ?";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			st.setString(1, "%" + lesson.getLike() + "%");
			Assertions.assertEquals("SELECT * FROM emp WHERE name LIKE '%木%'", st.toString());
		} catch (SQLException e) {
			fail();
		}
		return;
	}

}
