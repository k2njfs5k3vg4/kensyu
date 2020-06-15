package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest_ver3 {
	public static void main(String[] args) {
		//URL、ユーザー名、パスワードの設定
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";

		//SQL文の作成
		String sql = "INSERT INTO emp(code, name, age, tel)"
				+ "VALUES(8, '近藤', 29, '09-999-9999')";

		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);
				){

			//SQLの実行
			int rows = st.executeUpdate();
			System.out.println(rows + "件、データベースに追加しました。");

		} catch (SQLException e) {
			e.printStackTrace();

		}

	}
}
