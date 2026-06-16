package com.sample;

import org.springframework.web.bind.annotation.*;
import java.time.Instant;
import java.util.Map;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class HelloController {

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        return Map.of(
            "message", "Hello from Java Service!",
            "environment", System.getenv().getOrDefault("APP_ENV", "uat"),
            "timestamp", Instant.now().toString()
        );
    }
}
