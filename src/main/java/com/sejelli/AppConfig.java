package com.sejelli;

import com.sejelli.domain.application.OrganizationApp;
import com.sejelli.domain.application.OrganizationAppImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by user on 8/24/2016.
 */
@Configuration
public class AppConfig {

    @Bean
    OrganizationApp organizationApp(){
        return new OrganizationAppImpl();
    }
}
