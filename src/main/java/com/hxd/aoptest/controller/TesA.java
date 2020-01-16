package com.hxd.aoptest.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;

@Order(100)
public abstract class TesA  {
    private  final Log logger;

    protected TesA() {
        logger=LogFactory.getLog(TesA.class);
    }

    abstract String hello();

   /* public TesA() {
        this.logger = LoggerFactory.getLogger(TesA.class);
    }*/

    /*public Logger getLogger() {
        return logger;
    }*/
}
