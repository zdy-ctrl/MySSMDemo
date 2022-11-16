package com.atzdy.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/7 1:26
 * @Abstract：
 * @Before:前置通知 在目标对象方法执行之前执行
 */
@Aspect
@Component
public class LoggerAspect {

    @Pointcut("execution(* com.atzdy.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointcut() {
    }

    @Before("execution(public int com.atzdy.spring.aop.annotation.CalculatorImpl.add(int,int))")
    public void beforeMethod(JoinPoint joinPoint) {
        //获取连接点的签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("LoggerAspect,前置通知，方法名：" + methodName + ",参数：" + args);
    }

    @After("pointcut()")
    public void afterMethod(JoinPoint joinPoint) {
        //获取连接点的签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("LoggerAspect,后置通知，方法名：" + methodName + ",参数：" + args);
    }

    @AfterReturning(value = "pointcut()", returning = "result")
    public void afterReturnMethod(JoinPoint joinPoint, Object result) {
        //获取连接点的签名信息
        String methodName = joinPoint.getSignature().getName();
        //获取目标方法到的实参信息
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("LoggerAspect,返回通知，方法名：" + methodName + ",参数：" + args + ",结果：" + result);
    }

    @AfterThrowing(value = "pointcut()",throwing="ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Throwable ex) {
        String methodName = joinPoint.getSignature().getName();
        String args = Arrays.toString(joinPoint.getArgs());
        System.out.println("LoggerAspect,异常e通知，方法名：" + methodName + ",参数：" + args + ",异常：" + ex);
    }

    @Around("pointcut()")
    public Object aroundMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知--》前置通知");
            //表示目标对象的方法执行
            result = joinPoint.proceed();
            System.out.println("环绕通知--》返回通知");

        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知--》异常通知");
        }finally {
            System.out.println("环绕通知--》后置通知");
        }
        return result;
    }
}
