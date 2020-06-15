package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertTest_ver2 {
	public static void main(String[] args) {
		//データベースへの接続
		Connection con = null;
		//PreparedStatementオブジェクトの取得
		PreparedStatement st = null;

		try {

			//JDBCドライバの登録
			Class.forName("org.postgresql.Driver");

			//URL、ユーザー名、パスワードの設定
			String url = "jdbc:postgresql:sample";
			String user = "student";
			String pass = "himitu";

			//データベースへの接続
			con = DriverManager.getConnection(url, user, pass);

			//SQL文の作成
			String sql = "INSERT INTO emp(code, name, age, tel)"
					+ "VALUES(8, '近藤', 29, '09-999-9999')";

			//PreparedStatementオブジェクトの取得
			st = con.prepareStatement(sql);

			//SQLの実行
			int rows = st.executeUpdate();
			System.out.println(rows + "件、データベースに追加しました。");

//			//リソースの解放
//			st.close();
//			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			//リソースの解放
			try {
				if (st != null) {
					st.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
			try {
				if (st != null) {
					con.close();
				}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}



	}
}
