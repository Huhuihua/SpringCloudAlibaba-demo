package com.huihua.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

@SpringBootTest
public class DiscoveryTest {
    @Autowired
    private DiscoveryClient discoveryClient;
    @Test
    void testDiscovery() {
        List<String> services = discoveryClient.getServices();
        for(String service : services){
            System.out.println("service: " + service);
        }
    }
}
