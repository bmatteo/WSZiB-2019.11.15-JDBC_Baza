package pl.edu.wszib;

import pl.edu.wszib.db.DBConnector;
import pl.edu.wszib.model.User;

public class Main {
    public static void main(String[] args) {
        DBConnector.connect();
        User user = new User();
        user.setId(1);
        user.setLogin("login");
        user.setPassword("haslo");

        //DBConnector.addUser(user);

        User userFromDb = DBConnector.getUser("login", "haslo");
        System.out.println(userFromDb);
    }
}
