package com.ts.demo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspect {
    //hahaha
    @Pointcut("execution(* com.ts.demo.controller.TestController.*(..))")
    public void pointCut(){};

    @Before(value = "pointCut()")
    public void  be(JoinPoint joinPoint){
        System.out.println("我是前置");

    }
    @After(value = "pointCut()")
    public  void ss(JoinPoint joinPoint){
        System.out.println("我是后置2");

    }
    @AfterReturning(value = "pointCut()")
    public  void  sss(JoinPoint joinPoint){

        System.out.println("我是后置");
    }
    @AfterThrowing(value = "pointCut()")
    public void ssss(){
        System.out.println("异常");
    }
    @Around(value = "pointCut()")
    public Object  aa(ProceedingJoinPoint pdj){
        Object proceed = null;
        try {
            System.out.println("我是环绕前");
             proceed = pdj.proceed();
            System.out.println("我是环绕后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return  proceed;
    }
}
