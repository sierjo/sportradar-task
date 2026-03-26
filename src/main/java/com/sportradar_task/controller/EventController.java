package com.sportradar_task.controller;

import com.sportradar_task.entity.Event;
import com.sportradar_task.repository.EventRepository;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventRepository eventRepository;

    public EventController(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    @GetMapping
    public List<Event> getAllEvents() {
        return eventRepository.findAllWithDetails();
    }


    @GetMapping("/{id}")
    public Event getEventById(@PathVariable Integer id) {
        return eventRepository.findById(id).orElseThrow();
    }


    @PostMapping
    public Event createEvent(@RequestBody Event event) {
        return eventRepository.save(event);
    }
}
