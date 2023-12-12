package web.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository

public class UserRepository {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }
    @Transactional
    public void delete(User user) {
        entityManager.remove(user);
    }
}
