package com.ngxspring.starter.ngxspringstarter;


import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    @Autowired
    private Environment env;

    @Override
    protected String getDatabaseName() {
        return env.getProperty("spring.data.mongodb.database");
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(env.getProperty("spring.data.mongodb.host"),
                Integer.parseInt(env.getProperty("spring.data.mongodb.port")));
    }

}
