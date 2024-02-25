package school.edu.entity;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "teacher_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long teacherId;
    private String firstName;
    private String lastName;
    private Long departmentID;
    private String phoneNumber;
    private String address;
}
