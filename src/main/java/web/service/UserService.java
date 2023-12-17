package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void add(User user);
    void update(User user);

    public User readUser(long id);

    User delete(long id);

    //void createOrUpdateUser(User user);
}
