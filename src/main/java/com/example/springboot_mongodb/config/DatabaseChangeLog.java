package com.example.springboot_mongodb.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.github.cloudyrock.mongock.driver.mongodb.springdata.v3.decorator.impl.MongockTemplate;

@ChangeLog
public class DatabaseChangeLog {

    @ChangeSet(order = "001", id="seedDatabase", author = "me")
    public void seedDatabase(MongockTemplate mongockTemplate){

    }
}
