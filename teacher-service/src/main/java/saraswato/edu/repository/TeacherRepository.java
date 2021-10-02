package saraswato.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saraswato.edu.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {


}
