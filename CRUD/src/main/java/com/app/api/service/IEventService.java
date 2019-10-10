package com.app.api.service;

import com.app.api.model.Event;
import java.util.List;

/**
 *
 * @author Melvin
 */
public interface IEventService {

    public List<Event> getEvents();
    
    public Event getEvent(int id);
    
    public Event addEvent(Event event);
    
    public void deleteEvent(int id);

}
