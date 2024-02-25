package school.edu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.edu.entity.Announcement;
import school.edu.service.AnnouncementService;

import java.util.List;

import static school.edu.util.Constants.API_BASE_PATH;

@RestController
@RequestMapping(value = API_BASE_PATH)
@Slf4j
public class AnnouncementController {
    private final AnnouncementService announcementService;

    public AnnouncementController(AnnouncementService announcementService) {
        this.announcementService = announcementService;
    }

    @GetMapping("/announcements")
    public List<Announcement> getAllAnnouncements(@RequestParam int page, @RequestParam int size) {
        if (page == 0 && size == 0) {
            size = 25;
//            for (long i = 1000; i < 1150; i++) {
//                Announcement announcement = new Announcement();
//                announcement.setAnnouncementId(i);
//                announcement.setDescription(i+" Registration open for Bhumuraj School for term fall 2024.");
//                announcement.setTitle(i+" Registration open!");
//                announcement.setPublisher(i+" hmp!");
//                announcement.setType(i+" Official");
//                announcement.setEmail(i+" hmp@email.com");
//                announcement.setAddress(i+" Murohy");
//                announcementService.saveAnnouncement(announcement);
//
//            }
        }

        return announcementService.getALlAnnouncements(page, size);
    }
    @GetMapping("/announcement")
    public ResponseEntity<Announcement> saveAnnouncement(@RequestBody Announcement announcement) {
        var announcementDb = announcementService.saveAnnouncement(announcement);
        return announcementDb != null ? ResponseEntity.ok(announcementDb) : ResponseEntity.badRequest().build();

    }
    @GetMapping("/announcement/{announcementId}")
    public ResponseEntity<Announcement> findAnnouncementById(@PathVariable long announcementId) {
        var announcementDb = announcementService.getAnnouncementById(announcementId);
        log.info("after calling db for announcementId: {} data: {}: ", announcementId, announcementDb);
        return announcementDb != null ? ResponseEntity.ok(announcementDb) : ResponseEntity.notFound().build();

    }

}
