package com.example.newProject.Services;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

@Configuration
public class AuditorAwareConfig {

    @Bean
    public AuditorAware<String> auditorAware() {
        // Replace this with your logic to determine the current auditor (e.g., user)
        return () -> Optional.of("currentUsername");
    }
}
