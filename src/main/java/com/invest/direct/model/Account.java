package com.invest.direct.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document(collection = "account")
public class Account implements Serializable {
    @Id
    private ObjectId _id;

    private String realName;

    public ObjectId getId() {
        return _id;
    }

    public String getName() {
        return realName;
    }

    public String setName(String realName) {
        return this.realName = realName;
    }
}