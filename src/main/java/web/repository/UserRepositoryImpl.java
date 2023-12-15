package web.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository

public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;
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
    public void deleteUser(Long id) {
        entityManager.remove(entityManager.find(User.class, id));

    }
    @Transactional
    @Override
    public List<User> getAllUsers() {
        TypedQuery<User> query = entityManager.createQuery("SELECT u FROM users u", User.class);
        return query.getResultList();
    }
}
