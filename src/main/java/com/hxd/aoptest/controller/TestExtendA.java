package com.hxd.aoptest.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Configuration
public class TestExtendA extends TesA {


    @Override
     String hello() {
        System.out.println();
        //logger.info("aaaaaaa");
        return "Hello";
    }

    public void asss(){
        //logger.info("BBBB");
    }


}
