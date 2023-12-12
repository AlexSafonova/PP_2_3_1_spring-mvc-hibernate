package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;

@Service

public class UserServiceImpl implements UserService {
    private UserRepository repository;

    public UserServiceImpl() {
    }
    @Autowired
    public UserServiceImpl(UserRepository repository) {
        super();
        this.repository = repository;
    }
    @Transactional

    @Override
    public void addUser(User user) {
        repository.save(user);

    }
    @Transactional

    @Override
    public void updateUser(User user) {
        repository.save(user);

    }
    @Transactional

    @Override
    public void deleteUser(User user) {
        repository.delete(user);

    }
}

