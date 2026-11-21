package com.example.devops;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
    @GetMapping("/")
    public Map<String, String> home() {
        return Map.of("project", "Java AWS DevOps Pipeline", "message", "Application is running");
    }
    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }
    @GetMapping("/api/message")
    public Map<String, String> message() {
        return Map.of("message", "Hello from our DevOps project!");
    }
}
