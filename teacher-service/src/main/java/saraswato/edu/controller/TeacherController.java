package saraswato.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import saraswato.edu.entity.Teacher;
import saraswato.edu.service.TeacherService;

import java.util.List;

@RestController
@RequestMapping("/")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping("/teacher")
    public List<Teacher> saveTeachers(@RequestBody List<Teacher> list){
        return teacherService.saveTeachers(list);
    }
}
