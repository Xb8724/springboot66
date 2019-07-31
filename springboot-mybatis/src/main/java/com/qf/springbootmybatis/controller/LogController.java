package com.qf.springbootmybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("log")
@Slf4j
public class LogController {

    //加了slf4j注释就不需要
    //private Logger logger= LoggerFactory.getLogger(LogController.class);

    @RequestMapping("out")
    public String out(){
        /*logger.debug("debug.....");
        logger.info("info.....");
        logger.warn("warn.....");
        logger.error("error.....");*/
        log.debug("debug.....");
        log.info("info.....");
        return "ok";
    }
}
