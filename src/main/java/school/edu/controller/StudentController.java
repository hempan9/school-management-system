package school.edu.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.edu.entity.Login;
import school.edu.entity.Student;
import school.edu.service.StudentService;

import java.util.List;

import static school.edu.util.Constants.API_BASE_PATH;

@RestController
@RequestMapping(value = API_BASE_PATH)
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/student")
    public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.saveStudent(student));
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(@RequestParam int page, @RequestParam  int size) {
        if (page == 0 && size == 0) {
            size = 25;
        }
        return studentService.getAllStudents(page, size);
    }

    @PostMapping("/login")
    public ResponseEntity<Login> loginStudent(@RequestBody Login student) {
        System.out.println("Login dto received respose: "+student);
        if ("ram".equals(student.username()) && "ram".equals(student.password()))
            return ResponseEntity.ok(student);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
    }

    @PostMapping("/signup")
    public List<Student> loginStudent(@RequestBody Student student) {
        return studentService.saveStudents(List.of(student));
    }
}
