package com.tourism;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
public class TouristController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/tourists")
    public String getTourists() {
        return "Smart Tourism Portal: Tourist Service running on port "
                + port;
    }
}