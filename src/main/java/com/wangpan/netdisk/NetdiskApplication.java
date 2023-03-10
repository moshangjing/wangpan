package com.wangpan.netdisk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan("com.wangpan.netdisk.dao")
public class NetdiskApplication {

    public static void main(String[] args) {

        SpringApplication.run(NetdiskApplication.class, args);


    }

}
