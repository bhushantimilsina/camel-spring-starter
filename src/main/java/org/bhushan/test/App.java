package org.bhushan.test;

import org.apache.camel.CamelContext;
import org.apache.camel.spring.SpringCamelContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("camel-context.xml");
        CamelContext camelContext = new SpringCamelContext(applicationContext);

        try {
            camelContext.start();
            TimeUnit.SECONDS.sleep(1);
        } finally {
            TimeUnit.SECONDS.sleep(1);
            camelContext.stop();
        }
        TimeUnit.SECONDS.sleep(1);
        System.exit(0);
    }
}
