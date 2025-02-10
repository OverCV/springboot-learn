package com.plexus.manager.infraestructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.plexus.manager.infraestructure.persistence.jpa.repository")
public class DatabaseConfig {
    
}
