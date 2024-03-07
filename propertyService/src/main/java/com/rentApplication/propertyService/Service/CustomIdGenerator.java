package com.rentApplication.propertyService.Service;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.Connection;

import java.io.Serializable;

public class CustomIdGenerator implements IdentifierGenerator {

    private static final String PREFIX = "Property-";
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        Jedis jedis = new Jedis("redis://default:KG58Cc5lgvWush8KwgqyzROEblorNt5R@redis-12670.c322.us-east-1-2.ec2.cloud.redislabs.com:12670");
        Connection connection = jedis.getConnection();
        String value = jedis.get("PropertyDetailsIDValue");
        int count = Integer.parseInt(value);
        String generatedId = PREFIX + count;
        count++;
        value = Integer.toString(count);
        jedis.set("PropertyDetailsIDValue",value);
        connection.close();
        return generatedId;
    }
}
