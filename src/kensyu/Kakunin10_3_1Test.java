package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Kakunin10_3_1Test {

	@Test
	void test1() {
		//URL、ユーザー名、パスワードの設定
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";

		//SQL文の作成
		String sql = "select * from emp order by age";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {

			//SQLの実行
			//					ResultSet rs = st.executeQuery();
			rs.next();
			Assertions.assertEquals(23, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(28, rs.getInt("age"));
			Assertions.assertEquals(2, rs.getInt("code"));
			Assertions.assertEquals("佐藤", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(29, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(30, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(30, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(46, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

			rs.next();
			Assertions.assertEquals(57, rs.getInt("age"));
			Assertions.assertEquals(6, rs.getInt("code"));
			Assertions.assertEquals("吉田", rs.getString("name"));
			Assertions.assertEquals("012-999-999", rs.getString("tel"));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	void test2() {
		//URL、ユーザー名、パスワードの設定
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";

		//SQL文の作成
		String sql = "select * from emp order by age";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				ResultSet rs = st.executeQuery();) {

			//SQLの実行
			//					ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("code") + "：");
				System.out.print(rs.getString("name") + "：");
				System.out.print(rs.getInt("age") + "：");
				System.out.println(rs.getString("tel"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
