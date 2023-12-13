package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Autowired

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserServiceImpl() {
    }
    @Transactional
    @Override
    public void addUser(User user) {
        userRepository.addUser(user);

    }
    @Transactional

    @Override
    public void updateUser(User user) {
        userRepository.updateUser(user);

    }
    @Transactional

    @Override
    public void deleteUser(User user) {
        userRepository.deleteUser(user);

    }
}

