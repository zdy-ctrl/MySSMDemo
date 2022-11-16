package com.atzdy.spring.aop;

import com.atzdy.spring.aop.annotation.Calculator;
import com.atzdy.spring.aop.annotation.CalculatorImpl;
import com.atzdy.spring.aop.annotation.LoggerAspect;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @title:
 * @author: ZDY
 * @date: 2022/10/7 1:41
 * @Abstract：
 */
public class annotationTest {
    @Test
    public void beforeAopTest() {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = context.getBean(Calculator.class);
        calculator.add(1, 2  );
    }

}
