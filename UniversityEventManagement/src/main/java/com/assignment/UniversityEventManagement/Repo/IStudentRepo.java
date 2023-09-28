package com.assignment.UniversityEventManagement.Repo;

//import com.assignment.UniversityEventManagement.Model.Event;
import com.assignment.UniversityEventManagement.Model.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student, Integer> {
}
