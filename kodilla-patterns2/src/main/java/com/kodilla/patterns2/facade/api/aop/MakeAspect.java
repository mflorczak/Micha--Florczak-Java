package com.kodilla.patterns2.facade.api.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MakeAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(MakeAspect.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))" +
    "&&target(object)")
    public void log(Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + " calling the method processOrder()");
    }
}
