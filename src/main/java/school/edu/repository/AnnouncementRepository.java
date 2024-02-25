package school.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import school.edu.entity.Announcement;
@Repository
public interface AnnouncementRepository extends JpaRepository<Announcement, Long> {
}
