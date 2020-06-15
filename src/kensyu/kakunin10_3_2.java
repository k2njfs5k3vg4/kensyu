package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class kakunin10_3_2 {

	String url = "jdbc:postgresql:sample";
	String user = "student";
	String pass = "himitu";

	String r_code = null;
	String r_name = null;
	String r_age = null;
	String r_tel = null;

	public String executeSQL(int code, String name, int age, String tel) {
		//SQL文の作成
		String sql1 = "INSERT INTO emp(code, name, age, tel)"
				+ " VALUES(" + code + ", '" + name + "'," + age + ",' " + tel + "')";
//		System.out.println(sql1);

		String sql2 = "select * from emp where code =" + code;
//		System.out.println(sql2);

		// SQL1の実行
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st1 = con.prepareStatement(sql1);) {
			//SQLの実行
			int rows = st1.executeUpdate();
			//			System.out.println(rows + "件、データベースに追加しました。");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	// SQL2の実行
			try ( Connection con = DriverManager.getConnection(url, user, pass);
					PreparedStatement st2 = con.prepareStatement(sql2);) {
				//SQLの実行
				ResultSet rs = st2.executeQuery();

				// 戻り値のセット
				// st.toString
				rs.next();
				r_code = String.valueOf(rs.getInt("code"));
				r_name = rs.getString("name");
				r_age = String.valueOf(rs.getInt("age"));
				r_tel = rs.getString("tel");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return r_code +":"+ r_name +":"+ r_age +":"+ r_tel;
		}


}
