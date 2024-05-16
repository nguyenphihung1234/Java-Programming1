package session8.model;

import session8.entity.Users;
import session8.model.DBCollection;
import session8.model.LoginDAO;

import java.sql.*;

public class LoginDAOImpl implements LoginDAO {

    private static final Connection conn;

    static {
        try {
            conn = DBCollection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private Statement stmt = null;
    private PreparedStatement pstm =null;

    @Override
    public String checkLoginStatement(Users user) {
        String query = "SELECT user name FROM WHERE username='"+user.getUsername()+"'"+"AND password='"+user.getPassword()+"'";
      try {
          stmt = conn.createStatement();
          ResultSet rs = stmt.executeQuery(query);
          while (rs.next()){
              System.out.println("username id:" +rs.getString("username"));
              return rs.getString("username");
          }
          return "Not in the Database";
      }catch (SQLException ex){
          ex.printStackTrace();
          return "false";
      }

    }

    @Override
    public String checkLoginPrepareStatement(Users user) {
        String query = "SELECT username FROM users WHERE username like ? and password like?";
        try {
            //Tái sử dụng lại PrepareStatement
            pstm = conn.prepareStatement(query);
            pstm.setString(1, user.getUsername());
            pstm.setString(2, user.getPassword());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                System.out.println("username is:" +rs.getString("username"));
                return rs.getString("username");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
