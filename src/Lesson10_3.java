import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Lesson10_3 {

	private String key;
	private String an;
	private ArrayList<String> ans = new ArrayList<String>();
	private int i = 0;

	public Lesson10_3(String string) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.key = string;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String sql() {
		String sql = "SELECT * FROM emp WHERE name LIKE '%" + key + "%'";
		return sql;
	}

	public ArrayList<String> search() {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc:postgresql:sample";
		String user = "student";
		String pass = "himitu";
		String sql = "SELECT * FROM emp WHERE name LIKE '%" + key + "%'";
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement st = con.prepareStatement(sql);) {
			//Class.forName("org.postgresql.Driver");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				ans.add(rs.getString("code") + " : " + rs.getString("name") + " : " + rs.getString("age") + " : "
						+ rs.getString("tel"));

			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return ans;
	}

}
