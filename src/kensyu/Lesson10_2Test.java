package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Lesson10_2Test {

	@Test
	void test() {
		Lesson10_2 a = new Lesson10_2();
		Assertions.assertEquals("9 : 木間 : 24 : 080-1111-2222", a.insertSql(9, "木間", 24, "080-1111-2222"));
	}

	@BeforeEach
	void deleteDB() {
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";

		String sql = "DELETE FROM emp";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {

			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
