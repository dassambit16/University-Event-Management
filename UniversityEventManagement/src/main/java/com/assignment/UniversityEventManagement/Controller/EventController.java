package com.assignment.UniversityEventManagement.Controller;

import com.assignment.UniversityEventManagement.Model.Event;
import com.assignment.UniversityEventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("events")
    public String addEvents(@RequestBody List<Event> events) {
        return eventService.addEvents(events);
    }

    @PutMapping("event/id/{id}/location/{location}")
    public String updateEventLocationById(@PathVariable Integer id, @PathVariable String location) {
        return eventService.updateEventLocationById(id, location);
    }

    @GetMapping("events/date")
    public Iterable<Event> getEventsOnSameDate(@RequestParam LocalDate date)
    {
        return eventService.getEventsOnSameDate(date);
    }
}
