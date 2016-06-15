package com.ecom.common;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.net.MalformedURLException;

@Configuration
@PropertySource(value = "classpath:couchdb.properties")
public class CouchDbConfig {

    @Autowired
    private Environment environment;

    @Bean
    public CouchDbInstance createCouchDbInstance() {

        try {
            return new StdCouchDbInstance(new StdHttpClient
                    .Builder()
                    .url(environment.getProperty("couchdb-url"))
                    .password(environment.getProperty("couchdb-password"))
                    .username(environment.getProperty("couchdb-user"))
                    .build());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public CouchDbConnector getCouchDbConnector() {
        return createCouchDbInstance().createConnector(environment.getProperty("couchdb-database"), true);
    }
}
