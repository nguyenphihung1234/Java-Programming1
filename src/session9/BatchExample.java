package session9;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.SQLException;

public class BatchExample {
    public static void main(String[] args) throws SQLException {

        Connection connection = MySQLConnectDB.getMySqlConnection();
        Statement stm = connection.createStatement();
        // Kiem soat giao dich tu dong
        connection.setAutoCommit(false);
        //Query 1
        String query1 = "insert into orders values (3,1,'24/04/25')";
        stm.addBatch(query1);
        //Query 2
        String query2 = " insert into order_detail values (3,1,1)";
        stm.addBatch(query2);
        //Query 3
        String query3 = "update products set price = 500 where product_id =1";
        stm.addBatch(query3);

        int[] counts = stm.executeBatch();
        System.out.println("Query 1" +counts[0]);
        System.out.println("Query 2" +counts[1]);
        System.out.println("Query 3" +counts[2]);
        connection.commit();
    }
}
