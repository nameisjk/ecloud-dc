package com.xm.dc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xm.dc.mapper")
public class EcloudDcApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcloudDcApplication.class, args);
    }

}
