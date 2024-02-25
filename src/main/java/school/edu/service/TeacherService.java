package school.edu.service;

import org.springframework.stereotype.Service;
import school.edu.entity.Teacher;
import school.edu.repository.TeacherRepository;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(final TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    public List<Teacher> saveTeachers(List<Teacher> teachers) {
        teacherRepository.saveAll(teachers);
        return teachers;
    }
}
