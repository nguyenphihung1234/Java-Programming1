package session8.controller;

import session8.model.LoginDAOImpl;
import session8.entity.Users;

public class LoginController {
    LoginDAOImpl loginDAO = new LoginDAOImpl();
    //step 1
    public String loginStatementController(Users user){
        //step 2,3 call model and return to view
        return  loginDAO.checkLoginStatement(user);
    }
    public String loginPreparedController(Users user ){
        return loginDAO.checkLoginPrepareStatement(user);
    }

}
