package session7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyApplication {
   // private  static final Statement statement;
    private static final  String tableName = "Customers";
    public static void main(String[] args) throws SQLException {
      getAllCustomer();
     // createCustomer();
        createCustomerFixed(7,"Nguyen","Phi Hung", "hung@fpt.com.vn");
    }
    public  static  void deleteCustomer() throws SQLException{
        String query = "DELETE customers set first_name ='Tran' WHERE customer_id =1";
    }
    public  static  void updateCustomer() throws SQLException{
        String query = "UPDATE customers set first_name ='Tran' WHERE customer_id =1";
    }
    public static void createCustomer() throws SQLException{
        Connection connection = MySQLConnectDB.getMySqlConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT INTO customers(customer_id,first_name,last_name,email)"
              +  "values(6,'Nguyen','Phi Hung','hung@fpt.com.vn')";
        //Execute executeUpdate(): Create,Update, Delete
        int count = stm.executeUpdate(query);
        System.out.println("Them ban ghi so:" + count);
    }
    public  static void createCustomerFixed(int cus_id,String fname, String lname, String email) throws SQLException{
        Connection connection = MySQLConnectDB.getMySqlConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT into "+ tableName +"values("+cus_id+","+fname+","+lname+","+email+")";
        int count = stm.executeUpdate(query);
        System.out.println("Them ban ghi so:" + count);

    }
    public static void getAllCustomer() throws SQLException{
        //Gọi dt Connection
        Connection connection = MySQLConnectDB.getMySqlConnection();
        //Tạo Statement(thi hành thao tác)
        Statement stm = connection.createStatement();
        //Câu  lệnh truy vấn(sql engine)
        String query = "select * from customers";
        //thục thi truy vấn , trả kết quả từ database cho dt ResultSet
        ResultSet rs = stm.executeQuery(query);

        //Đọc bảng ghi trên ResultSet
        while (rs.next()){
            int cusId = rs.getInt(1);
            //   int cusID = rs.getInt("customer_id");
            String first_name= rs.getString(2);
            String last_name= rs.getString(3);
            String email= rs.getString(4);
            System.out.println("===========================");
            System.out.println("Customer ID: "+ cusId);
            System.out.println("First Name: " +first_name);
            System.out.println("Last_Name: " +last_name);
            System.out.println("Email: " +email);
        }
        connection.close();
    }
}
