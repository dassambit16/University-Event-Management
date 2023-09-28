package com.assignment.UniversityEventManagement.Controller;

import com.assignment.UniversityEventManagement.Model.Department;
import com.assignment.UniversityEventManagement.Model.Student;
import com.assignment.UniversityEventManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("student")
    public String addAStudent(@RequestBody Student student) {
        return  studentService.addAStudent(student);
    }

    @PostMapping("students")
    public String addStudents(@RequestBody List<Student> students) {
        return studentService.addStudents(students);
    }

    @GetMapping("students")
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @DeleteMapping("student/id/{id}")
    public String deleteStudentById(@PathVariable Integer id) {
        return studentService.deleteStudentById(id);
    }

    @PutMapping("student/id/{id}/department/{department}")
    public String updateStudentDepartmentById(@PathVariable Integer id, @PathVariable Department department) {
        return studentService.updateStudentDepartmentById(id, department);
    }


}
