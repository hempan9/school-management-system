package saraswato.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
@RequestMapping("/")
public class TeacherServiceApplication {
    @GetMapping("")
    public String sayHello(){
        return "Hey Phaiju";
    }

    public static void main(String[] args) {
        SpringApplication.run(TeacherServiceApplication.class, args);
    }

}

