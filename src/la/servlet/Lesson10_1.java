package la.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Lesson10_1 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp order by age";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			//			Class.forName("org.postgresql.Driver");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				System.out.print(rs.getInt("code") + " : ");
				System.out.print(rs.getString("name") + " : ");
				System.out.print(rs.getInt("age") + " : ");
				System.out.println(rs.getString("tel"));
			}
		} catch (SQLException e) {// | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
