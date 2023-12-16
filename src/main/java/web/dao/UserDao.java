package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAll();

    public void save(User user);

    public void delete(int id);
}
