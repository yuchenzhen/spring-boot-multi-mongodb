package com.invest.direct.dao;

import com.invest.direct.model.Account;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class AccountDao {
    @Autowired
    @Qualifier(value = "investDbConfigMongoTemplate")
    private MongoTemplate investDbConfigMongoTemplate;


    public List<Account> findAll() {
        List<Account> user = investDbConfigMongoTemplate.findAll(Account.class);
        return user;
    }
}
