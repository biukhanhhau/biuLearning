package org.biukhanhhau.learningrestcontroller.AOP;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(PerformanceAspect.class);

    @Around("execution(* org.biukhanhhau.learningrestcontroller.service.InforService.*(..))")
    public Object checkTime(ProceedingJoinPoint time) throws Throwable {
        long start = System.currentTimeMillis();

        Object object = time.proceed();

        long stop = System.currentTimeMillis();
        LOGGER.info(time.getSignature().getName() + " takes " + (stop-start) + " ms");
        return object;
    }
}
