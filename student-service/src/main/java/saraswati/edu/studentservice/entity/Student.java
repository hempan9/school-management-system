package saraswati.edu.studentservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "student_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long studentId;
private String firstName;
private String lastName;
private Long departmentID;
private String phoneNumber;
private String address;

}
