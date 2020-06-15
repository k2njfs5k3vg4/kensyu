package kensyu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Kakunin10_3_3 {
	String url = "jdbc:postgresql:sample";
	String user = "student";
	String pass = "himitu";

	String r_code = null;
	String r_name = null;
	String r_age = null;
	String r_tel = null;

	public String kensaku(String word) {

		String sql1 = "select * from emp where name like '%?%'";

		// SQL1の実行
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st1 = con.prepareStatement(sql1);) {
			//SQLの実行

			st1.setString(1, word);
			ResultSet rs = st1.executeQuery();

			// 戻り値のセット
			// st.toString
			rs.next();
			r_code = String.valueOf(rs.getInt("code"));
			r_name = rs.getString("name");
			r_age = String.valueOf(rs.getInt("age"));
			r_tel = rs.getString("tel");

			//実行するSQL表示
			System.out.println(st1.toString());

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r_code + ":" + r_name + ":" + r_age + ":" + r_tel;

	}

}
