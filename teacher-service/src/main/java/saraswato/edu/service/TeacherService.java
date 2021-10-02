package saraswato.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import saraswato.edu.entity.Teacher;
import saraswato.edu.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;
    public List<Teacher> saveTeachers(List<Teacher> teachers){
        teacherRepository.saveAll(teachers);
        return teachers;
    }
}
