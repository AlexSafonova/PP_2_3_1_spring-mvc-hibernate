package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UseRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service

public class UserServiceImpl implements UserService {

    private UseRepository repository;

    public UserServiceImpl() {
    }
    @Autowired
    public UserServiceImpl(UseRepository repository) {
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

    }
}

