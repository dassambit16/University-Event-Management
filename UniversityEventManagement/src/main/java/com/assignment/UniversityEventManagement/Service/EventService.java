package com.assignment.UniversityEventManagement.Service;

import com.assignment.UniversityEventManagement.Model.Event;
import com.assignment.UniversityEventManagement.Repo.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {

    @Autowired
    IEventRepo iEventRepo;

    public String addEvents(List<Event> events) {
         iEventRepo.saveAll(events);
         return events.size() + " events were added!!";
    }


    public String updateEventLocationById(Integer id, String location) {
        Optional<Event> e = iEventRepo.findById(id);
        if(e.isEmpty()) return "Event id not found!!";

        Event eve = e.get();
        eve.setLocationOfEvent(location);
        iEventRepo.save(eve);
        return "Event's Location updated!!";
    }


    public Iterable<Event> getEventsOnSameDate(LocalDate date) {
        return iEventRepo.findByDate(date);
    }
}
