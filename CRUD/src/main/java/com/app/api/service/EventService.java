package com.app.api.service;

import com.app.api.model.Event;
import com.app.api.repository.EventRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Melvin
 */

@Service
public class EventService implements IEventService {
    
    @Autowired
    EventRepository everep;

    @Override
    public List<Event> getEvents() {
        return everep.findAll();
    }

    @Override
    public Event getEvent(int id) {
        return everep.findById(id).get();
    }

    @Override
    public Event addEvent(Event event) {
        return everep.save(event);
    }

    @Override
    public void deleteEvent(int id) {
        everep.deleteById(id);
    }
    
    
}
