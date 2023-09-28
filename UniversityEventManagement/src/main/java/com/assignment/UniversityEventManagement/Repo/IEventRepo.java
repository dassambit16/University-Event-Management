package com.assignment.UniversityEventManagement.Repo;

import com.assignment.UniversityEventManagement.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
//import java.util.Date;
@Repository
public interface IEventRepo extends JpaRepository<Event, Integer> {
    Iterable<Event> findByDate(LocalDate date);
}
