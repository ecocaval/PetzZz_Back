package com.petzzz.app.controllers;

import com.petzzz.app.responses.HealthCheckResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    private final HealthCheckResponse healthCheckResponse;

    @Autowired
    public HealthController(HealthCheckResponse healthCheckResponse) {
        this.healthCheckResponse = healthCheckResponse;
    }

    @GetMapping
    public ResponseEntity<HealthCheckResponse> healthCheck() {
        return ResponseEntity.ok(healthCheckResponse.assemble("Health Checked!"));
    }
}
