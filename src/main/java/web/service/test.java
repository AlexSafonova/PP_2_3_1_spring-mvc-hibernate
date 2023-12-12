package web.service;

import web.model.User;
import web.repository.UserRepository;

public class test {
    public static void main(String[] args) {
        //UserService service = new UserServiceImpl();
        //service.addUser(new User("test", "test"));
        UserRepository repository = new UserRepository();
        repository.save(new User("test", "test"));
    }
}
