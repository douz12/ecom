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
    private final String DATABASE = environment.getProperty("couchdb-database");
    private final String URL = environment.getProperty("couchdb-url");

    public CouchDbInstance createCouchDbInstance() {
        try {
            return new StdCouchDbInstance(new StdHttpClient
                    .Builder()
                    .url(URL)
                    .build());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Bean
    public CouchDbConnector getCouchDbConnector() {
        return createCouchDbInstance().createConnector(DATABASE, true);
    }
}
