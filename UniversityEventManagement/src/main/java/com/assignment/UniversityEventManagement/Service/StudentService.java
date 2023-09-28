package com.assignment.UniversityEventManagement.Service;


import com.assignment.UniversityEventManagement.Model.Department;
import com.assignment.UniversityEventManagement.Model.Student;
import com.assignment.UniversityEventManagement.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo iStudentRepo;


    public String addAStudent(Student students) {
        iStudentRepo.save(students);
        return "student added!!";
    }

    public String addStudents(List<Student> students) {
        iStudentRepo.saveAll(students);
        return students.size() + " were added!!";
    }

    public Iterable<Student> getAllStudents() {
        return iStudentRepo.findAll();
    }


    public String deleteStudentById(Integer id) {
        Student s = iStudentRepo.findById(id).orElse(null);
        if(s == null) {
            return "Student are is not found in list!!";
        }
        iStudentRepo.delete(s);
        return "Student removed successfully!!";
    }

    public String updateStudentDepartmentById(Integer id, Department department) {
        Optional<Student> s = iStudentRepo.findById(id);
        if(s.isEmpty()) return "Student not found!!";

        Student stu = s.get();
        stu.setDepartment(department);
        iStudentRepo.save(stu);
        return "Student's department updated!!";
    }
}
