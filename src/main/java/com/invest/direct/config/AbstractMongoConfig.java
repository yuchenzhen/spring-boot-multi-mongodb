package com.invest.direct.config;

import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

public abstract class AbstractMongoConfig {
    //定义相关连接数据库参数
    private String uri;

    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * 创建MongoDbFactory，不同数据源继承该方法创建对应的MongoDbFactory。
     * @return
     * @throws Exception
     */
    public MongoDbFactory mongoDbFactory() throws Exception {
        return new SimpleMongoDbFactory(new MongoClientURI(uri));
    }
    /**
     * 抽象方法，用于返回MongoTemplate
     * @return
     * @throws Exception
     */
    abstract public MongoTemplate getMongoTemplate() throws Exception;
}
