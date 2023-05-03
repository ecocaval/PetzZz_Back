package com.petzzz.app.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HealthCheckResponse {
    private String status;
    private LocalDateTime timestamp;

    public HealthCheckResponse build(String status) {
        this.status = status;
        this.timestamp = LocalDateTime.now();
        return this;
    }
}
