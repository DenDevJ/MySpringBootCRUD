package web.service;
import web.model.User;
import web.dao.UserDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }
    @Override
    @Transactional
    public void update(User user) {
        userDao.update(user);
    }
    @Override
    @Transactional
    public void delete(Long id) {
        userDao.delete(id);
    }
    @Override
    public User findById(Long id) {
        return userDao.findById(id);
    }
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}