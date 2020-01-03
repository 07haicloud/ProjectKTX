package democnn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	public static Connection getJDBCConnection() {
		Connection cnn = null;
		final String url = "jdbc:sqlserver://DESKTOP-K1CK8JP:1433;databaseName=Sinhvien;integratedSecurity=true";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cnn= DriverManager.getConnection(url, "sa", "1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//			String cnnURL ="jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=Sinhvien;integratedSecurity=true";
 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnn;
		
			
	}
}
