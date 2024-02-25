package school.edu.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import school.edu.repository.StudentRepository;
import school.edu.entity.Student;


import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> saveStudents(List<Student> students) {
        studentRepository.saveAll(students);
        return students;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents(int page, int size) {
        return studentRepository.findAll(PageRequest.of(page, size, Sort.by("studentId"))).stream().toList();
    }
}
