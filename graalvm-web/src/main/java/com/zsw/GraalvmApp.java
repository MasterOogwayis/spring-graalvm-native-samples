package com.zsw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * @author ZhangShaowei on 2020/12/22 15:29
 */
@SpringBootApplication
public class GraalvmApp {

    /**
     * start server
     *
     * @param args args
     */
    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext run = SpringApplication.run(GraalvmApp.class, args);
        System.out.println("服务器已启动...");
        TimeUnit.MINUTES.sleep(2);
    }

}
