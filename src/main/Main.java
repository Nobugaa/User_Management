package main;


import controller.UserManagement;
import model.User;

public class Main {

    public static void main(String[] args) {
        User user = new User();
        
        new UserManagement(user).run();
    }
    
}
