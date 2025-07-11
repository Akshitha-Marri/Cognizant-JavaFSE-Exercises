package com.library;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

    @Before("execution(* com.library.BookService.displayBook(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[LOG] Method called: " + joinPoint.getSignature().getName());
    }
}
