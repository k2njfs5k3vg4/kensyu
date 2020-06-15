package la.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lesson10_1 {
	public ArrayList<String> get() {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp order by age";
		ArrayList<String> ans = new ArrayList<String>();
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			//			Class.forName("org.postgresql.Driver");
			ResultSet rs = st.executeQuery();
			while (rs.next()) {

				ans.add(rs.getString("code") + " : " + rs.getString("name") + " : " + rs.getString("age") + " : "
						+ rs.getString("tel"));
			}
			return ans;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}

	}

}
