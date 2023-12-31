package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> getAllUsers();
}
