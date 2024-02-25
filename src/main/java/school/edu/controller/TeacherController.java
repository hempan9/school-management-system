package school.edu.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.edu.entity.Teacher;
import school.edu.service.TeacherService;

import java.util.List;

import static school.edu.util.Constants.API_BASE_PATH;

@RestController
@RequestMapping(value = API_BASE_PATH)
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(final TeacherService teacherService) {
        this.teacherService= teacherService;
    }

    @PostMapping("/teacher")
    public List<Teacher> saveTeachers(@RequestBody List<Teacher> list){
        return teacherService.saveTeachers(list);
    }
}
