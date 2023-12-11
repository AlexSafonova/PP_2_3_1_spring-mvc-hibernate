package web.service;

import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import web.config.HiberConfig;
import web.model.User;
import web.repository.UserRepository;

@Service

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }

    @Override
    public void addUser(User user) {
        userRepository.addUser(user);


    }

    @Override
    public void updateUser(User user) {


    }

    @Override
    public void deleteUser(User user) {


    }
}
