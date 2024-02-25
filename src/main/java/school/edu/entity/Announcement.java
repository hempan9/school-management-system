package school.edu.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "Announcement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long announcementId;
    private String type;
    private String title;
    private String description;
    private String publisher;
    private String phoneNumber;
    private String email;
    private String address;}
