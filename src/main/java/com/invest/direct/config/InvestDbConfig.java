package com.invest.direct.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.DefaultDbRefResolver;
import org.springframework.data.mongodb.core.convert.DefaultMongoTypeMapper;
import org.springframework.data.mongodb.core.convert.MappingMongoConverter;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.invest")
public class InvestDbConfig extends AbstractMongoConfig {
//    @Primary
//    @Override
//    public @Bean(name = "investDbConfigMongoTemplate") MongoTemplate getMongoTemplate(MongoMappingContext context) throws Exception {
//        //去除保存实体时，spring data mongodb 自动添加的_class字段
//        MappingMongoConverter converter = new MappingMongoConverter(new DefaultDbRefResolver(mongoDbFactory()), context);
//        converter.setTypeMapper(new DefaultMongoTypeMapper(null));
//
//        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), converter);
//
//        return mongoTemplate;
//    }
    @Primary
    @Override
    @Bean(name ="investDbConfigMongoTemplate")
    public  MongoTemplate getMongoTemplate() throws Exception {
        return new MongoTemplate(mongoDbFactory());
    }

}
