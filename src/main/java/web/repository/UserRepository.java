package web.repository;

import web.model.User;

public interface UserRepository {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long id);
}
