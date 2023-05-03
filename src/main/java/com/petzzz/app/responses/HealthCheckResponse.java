package com.petzzz.app.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HealthCheckResponse {
    private String status;
    private LocalDateTime timestamp;

    public HealthCheckResponse assemble(String status) {
        this.status = status;
        this.timestamp = LocalDateTime.now();
        return this;
    }
}
