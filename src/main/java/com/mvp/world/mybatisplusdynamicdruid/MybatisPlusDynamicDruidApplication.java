package com.mvp.world.mybatisplusdynamicdruid;

//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
@SpringBootApplication
public class MybatisPlusDynamicDruidApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDynamicDruidApplication.class, args);
    }

}
