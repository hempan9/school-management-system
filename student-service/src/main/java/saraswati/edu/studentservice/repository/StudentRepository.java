package saraswati.edu.studentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import saraswati.edu.studentservice.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


}
