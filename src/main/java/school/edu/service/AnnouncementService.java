package school.edu.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import school.edu.entity.Announcement;
import school.edu.repository.AnnouncementRepository;

import java.util.List;

@Service
public class AnnouncementService {
    private final AnnouncementRepository announcementRepository;

    public AnnouncementService(AnnouncementRepository announcementRepository) {
        this.announcementRepository = announcementRepository;
    }

    public List<Announcement> getALlAnnouncements(final int page, final int size) {
        return announcementRepository.findAll(PageRequest.of(page, size, Sort.by("announcementId"))).getContent();
    }

    public Announcement saveAnnouncement(Announcement announcement) {
        return announcementRepository.save(announcement);
    }

    public Announcement getAnnouncementById(long announcementId) {
        return announcementRepository.findById(announcementId).orElse(null);
    }
}
