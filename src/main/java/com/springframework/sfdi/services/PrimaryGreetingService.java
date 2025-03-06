package com.springframework.sfdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello world! - From Primary Bean";
    }
}
