package com.valdirluiz.app.interactors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ServiceTwo {

    private static Logger logger = LoggerFactory.getLogger(ServiceTwo.class);

    public void execute(){
        logger.info("Hello World");
    }

}
