package web.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository

public class UserRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    public void addUser(User user) {
        entityManager.persist(user);


    }
    @Transactional

    public void updateUser(User user) {
        entityManager.merge(user);

    }
    @Transactional

    public void deleteUser(User user) {
        entityManager.remove(user);

    }
}
