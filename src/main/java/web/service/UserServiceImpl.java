package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service

public class UserServiceImpl implements UserService {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional

    @Override
    public void addUser(User user) {
        entityManager.persist(user);


    }
    @Transactional

    @Override
    public void updateUser(User user) {
        entityManager.merge(user);

    }
    @Transactional

    @Override
    public void deleteUser(User user) {
        entityManager.remove(user);

    }
}

