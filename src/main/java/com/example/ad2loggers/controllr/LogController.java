package com.example.ad2loggers.controllr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
   private static final Logger logger = LoggerFactory.getLogger(LogController.class);


    @GetMapping("/log")
    public String logMessage(){
        String message = "Hello user!";

        //log manage framework
        //ELK stack
        //logstash
        //kibana

        logger.debug("{}:This is DEBUG level log message",message);
        logger.info("This is INFO level log message");
        logger.warn("This is WARN level log message");
        logger.error("This is ERROR level log message");

        try {
            throw  new RuntimeException("Hello i'm Exception");
        }catch (Exception e){
            logger.error("This is error: {}",e.getMessage());
        }

        return "log message generated!";
    }
}
