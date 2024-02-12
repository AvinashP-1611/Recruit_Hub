package com.example.newProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

    //now we access from database, we make customService
//    @Bean
//    public UserDetailsService userDetailsService() {
//         UserDetails user= User.builder().
//                username("Avinash")
//                .password(passwordEncoder().encode("Avinash")).roles("ADMIN").
//                build();
//        UserDetails user1= User.builder().
//                username("Moumita")
//                .password(passwordEncoder().encode("Moumita")).roles("ADMIN").
//                build();
//        return new InMemoryUserDetailsManager(user, user1);
//    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
}
