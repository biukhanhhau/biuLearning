package org.biukhanhhau.learningrestcontroller.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class ValidationAspect {
    Logger LOGGER = LoggerFactory.getLogger(ValidationAspect.class);

    @Around("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..)) && args(infoId)")
    public Object checkGetInput(ProceedingJoinPoint joinPoint, int infoId) throws Throwable {
        if (infoId < 0){
            LOGGER.info("the ID is wrong!!!");
            infoId = -infoId;
        }

        Object object = joinPoint.proceed(new Object[]{infoId});
        return object;
    }
}
