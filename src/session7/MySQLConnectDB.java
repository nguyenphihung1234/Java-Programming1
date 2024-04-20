package session7;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnectDB {
    public static Connection getMySqlConnection() throws SQLException {
        Connection conn = null;
        String hostName = " localhost";//127.0.0.1
        String dbName = "EmployeeFpt";
        String username = "root";
        String password = "";

        //String connection(chuỗi kêt nối )
        String connectionURL = "jdbc:mysql://"+hostName+":3306/"+dbName;
        conn = DriverManager.getConnection(connectionURL,username,password);
        return conn;
    }

    public static void main(String[] args) throws SQLException {
//        if(getMySqlConnection()!=null){
//            System.out.println("Kết nối thành công");
//        }
        //get Connection : gọi đối tượng Connection để use
        Connection connection = getMySqlConnection();
    }
}
