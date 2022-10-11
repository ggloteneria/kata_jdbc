package jm.task.core.jdbc;

import jm.task.core.jdbc.model.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Kus", (byte) 22);
        userService.saveUser("Art", "Gil", (byte) 4);
        userService.saveUser("Kilua", "Inn", (byte) 14);
        userService.saveUser("Nikita", "Kud", (byte) 19);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();

    }
}
