package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SelectLikeTest extends SelectLike {

	@Test
	void test() {
		SelectLike a = new SelectLike();

		Assertions.assertEquals("1 : 木間 : 24 : 080-1111-1111", a.like("木"));
	}

	@BeforeEach
	void deleteDB() {
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";

		String sql = "DELETE FROM emp";
		String sql2 = "INSERT INTO emp VALUES(1,'木間',24,'080-1111-1111')";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				PreparedStatement st2 = con.prepareStatement(sql2);) {

			st.executeUpdate();
			st2.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
