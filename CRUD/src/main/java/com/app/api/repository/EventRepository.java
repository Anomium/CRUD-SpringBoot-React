package com.app.api.repository;

import com.app.api.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Melvin
 */
public interface EventRepository extends JpaRepository<Event, Integer> {
    
}
