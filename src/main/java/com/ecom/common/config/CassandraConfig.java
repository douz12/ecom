package com.ecom.common.config;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.MappingManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:cassandra.properties")
public class CassandraConfig {

    @Autowired
    private Environment env;

    @Bean
    public MappingManager getMappingManager() {
        return new MappingManager(Cluster.builder()
                .withPort(Integer.parseInt(env.getProperty("port")))
                .addContactPoints(env.getProperty("contact-points"))
                .build().connect(env.getProperty("keyspace")));
    }
}
