package session8.view;

import session8.controller.LoginController;
import session8.entity.Users;

import java.io.IOException;
import java.util.Scanner;

public class LoginConsoleUI {
    //step1
    LoginController loginController = new LoginController();
    Users user = new Users();
    private final Scanner sc;
    public LoginConsoleUI() throws IOException{
        this.sc = new Scanner(System.in);
    }
    private int menu(){
        System.out.println("====ADmin zone====");
        System.out.println("1.Login Statement");
        System.out.println("2.Login PreparedStatement");
        System.out.println("0.Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    private  void loginStatement(){
        System.out.println("Enter name:");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        String result = loginController.loginStatementController(user);
        System.out.println(result);
    }
    private  void loginPreparedStatement(){
        System.out.println("Enter name:");
        String username = sc.nextLine();
        System.out.println("Enter password");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        String result = loginController.loginPreparedController(user);
        System.out.println(result);
    }
    public  void  start(){
        while (true){
            int choice = menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    loginStatement();break;
                case 2:
                    loginPreparedStatement();break;
                default: throw  new AssertionError();
            }
        }


    }
}
