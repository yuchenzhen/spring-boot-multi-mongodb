package com.invest.direct.config;

import com.mongodb.MongoClientURI;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

public abstract class AbstractMongoConfig {
    //定义相关连接数据库参数
    private String host, database, username, password, uri;
    private int port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

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
//        ServerAddress serverAddress = new ServerAddress(host, port);
//        MongoCredential mongoCredential = MongoCredential.createCredential(username, database, password.toCharArray());
//        MongoClientOptions options = MongoClientOptions.builder()
//                .connectionsPerHost(100)
//                .socketTimeout(30000)
//                .connectTimeout(3000)
//                .build();
//        return new SimpleMongoDbFactory(new MongoClient(serverAddress, mongoCredential, options), database);
    }
    /**
     * 抽象方法，用于返回MongoTemplate
     * @param context
     * @return
     * @throws Exception
     */
    abstract public MongoTemplate getMongoTemplate() throws Exception;
}
