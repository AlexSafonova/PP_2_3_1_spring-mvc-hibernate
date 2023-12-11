package web.service;

import web.model.User;

public class test {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.addUser(new User("name", "surname"));
    }
}
