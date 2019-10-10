package com.app.api.service;

import com.app.api.model.User;
import com.app.api.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Melvin
 */
@Service
public class UserService implements IUserService {
    
    @Autowired
    UserRepository urep;

    @Override
    public List<User> getUsers() {
        return urep.findAll();
    }

    @Override
    public User getUser(int id) {
        return urep.findById(id).get();
    }

    @Override
    public User addUser(User user) {
        return urep.save(user);
    }

    @Override
    public void deleteUser(int id) {
        urep.deleteById(id);
    }
    
}
