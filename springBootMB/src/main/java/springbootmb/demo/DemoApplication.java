package springbootmb.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("springbootmb.demo.mapper") //扫描的mapper
@SpringBootApplication()//禁用springBoot自带的配置的单数据源
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
