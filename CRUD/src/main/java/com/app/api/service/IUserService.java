/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.api.service;

import com.app.api.model.User;
import java.util.List;

/**
 *
 * @author Melvin
 */
public interface IUserService {

    public List<User> getUsers();

    public User getUser(int id);

    public User addUser(User user);

    public void deleteUser(int id);
}
