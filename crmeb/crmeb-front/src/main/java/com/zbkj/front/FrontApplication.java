package com.zbkj.front;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 程序主入口
 *
 */
@EnableAsync //开启异步调用
@EnableSwagger2
@Configuration
@EnableTransactionManagement
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class) //去掉数据源
@ComponentScan(basePackages = {"com.zbkj", "com.zbkj.front"})
@MapperScan(basePackages = {"com.zbkj.**.dao"})
@Slf4j
public class FrontApplication {
    public static void main(String[] args) {
        SpringApplication.run(FrontApplication.class, args);
        log.info(">>> " + FrontApplication.class.getSimpleName() + " is success!");
    }
}
