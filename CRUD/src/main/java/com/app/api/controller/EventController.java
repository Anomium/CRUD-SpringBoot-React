package com.app.api.controller;

import com.app.api.model.Event;
import com.app.api.service.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Melvin
 */
@RestController
@RequestMapping("/api")

@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class EventController {
    
    @Autowired(required = true)
    EventService ser;
    
    @GetMapping("/event")
    public List<Event> getEvents(){
        return ser.getEvents();
    }
    
    @GetMapping("/event/{id}")
    public Event getEvent(@PathVariable int id){
        return ser.getEvent(id);
    }
    
    @PostMapping("/event")
    public Event addEvent(@RequestBody Event e){
        return ser.addEvent(e);
    }
    
    @DeleteMapping("/event/{id}")
    public void deleteEvent(@PathVariable int id){
        ser.deleteEvent(id);
    }
    
    @PutMapping("/event")
    public Event updateEvent(@RequestBody Event e){
        return ser.addEvent(e);
    }
}
