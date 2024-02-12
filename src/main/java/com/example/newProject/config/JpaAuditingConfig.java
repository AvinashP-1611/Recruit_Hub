package com.example.newProject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.domain.AuditorAware;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class JpaAuditingConfig {

    @Autowired
    private AuditorAware<String> auditorAware;

    // Additional configuration...

    // If you want to set the timezone for auditing timestamps:
    /*
    @Bean
    public DateTimeProvider dateTimeProvider() {
        return () -> Optional.of(LocalDateTime.now()); // Customize as needed
    }
    */

    // If you want to enable modification auditing:
    /*
    @Bean
    public AuditorAware<String> modificationAuditorAware() {
        return new YourModificationAuditorAware();
    }
    */
}
