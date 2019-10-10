package com.app.api.repository;

import com.app.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Melvin
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
