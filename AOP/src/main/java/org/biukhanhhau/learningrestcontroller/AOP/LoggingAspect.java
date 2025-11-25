package org.biukhanhhau.learningrestcontroller.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

//    @Before("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))")
//    public void logMethodCall(){
//        LOGGER.info("Method called");
//    }       NORMAL

    @Before("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))") // Can use || for "Or" to add one more method
    public void logMethodCall(JoinPoint joinPoint){
        LOGGER.info("Method called " + joinPoint.getSignature().getName());
    }

    //Happen when it's an exception in method
    @AfterThrowing("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))") // Can use || for "Or" to add one more method
    public void logMethodCrash(JoinPoint joinPoint){
        LOGGER.info("Method Crashed " + joinPoint.getSignature().getName());
    }

    //Happen when the method work well
    @AfterReturning("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))") // Can use || for "Or" to add one more method
    public void logMethodFinish(JoinPoint joinPoint){
        LOGGER.info("Method Finished " + joinPoint.getSignature().getName());
    }

    //Happen after the method even crash or not
    @After("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))") // Can use || for "Or" to add one more method
    public void logMethodEnd(JoinPoint joinPoint){
        LOGGER.info("Method Done " + joinPoint.getSignature().getName());
    }



}
