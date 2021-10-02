package saraswati.edu.studentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saraswati.edu.studentservice.entity.Student;
import saraswati.edu.studentservice.repository.StudentRepository;


import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> saveStudents(List<Student> students){
        studentRepository.saveAll(students);
        return students;
    }
}
