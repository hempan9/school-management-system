package saraswati.edu.studentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saraswati.edu.studentservice.entity.Student;
import saraswati.edu.studentservice.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/student")
    public List<Student> saveTeachers(@RequestBody List<Student> list){
        return studentService.saveStudents(list);
    }
}
