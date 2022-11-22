package site.metacoding.firstapp.domain;

import java.util.List;

public interface UserDao {
    public User findById(Integer userId);
    public List<User> findAll();
    public int insert(User user);
    public int update(User user);
    public int deleteById(Integer userId); 
}
