package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest {

	public static void main(String[] args) {
		//		PreparedStatement st = null;
		//		Connection con = null;
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "INSERT INTO emp(code, name, age, tel) VALUES(8, '近藤', 29, '09-999-9999')";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			//SQLの実行
			int rows = st.executeUpdate();
			System.out.println(rows + "件、データベースに追加しました。");
			//リソースの開放
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
