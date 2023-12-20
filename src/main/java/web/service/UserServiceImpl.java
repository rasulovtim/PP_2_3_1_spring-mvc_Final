package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void update(User user) {
        userDao.update(user);
    }

    @Override
    public User readUser(long id) {
        try {
            return userDao.readUser(id);
        } catch (EntityNotFoundException ex) {
            throw ex;
        }
    }

    @Override
    @Transactional
    public void delete(long id) {
        try {
            userDao.delete(id);
        } catch (EntityNotFoundException ex) {
            throw ex;
        }
    }

}
