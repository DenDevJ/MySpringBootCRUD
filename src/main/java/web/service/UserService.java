package web.service;
import web.model.User;
import java.util.List;
public interface UserService {
    void save(String name, String email, int age);
    void update(Long id, String name, String email, int age);
    void delete(Long id);
    User findById(Long id);
    List<User> findAll();
}