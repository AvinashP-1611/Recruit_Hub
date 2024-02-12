package com.example.newProject.Services;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        // You would implement this method to return the username of the currently authenticated user
        // You might use Spring Security's SecurityContextHolder to get the current user's authentication details
        return Optional.of("currentUsername");
    }
}
