package top.luchchuan.health;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author luch
 * @date 2021/1/8 14:25
 */

@SpringBootApplication
@MapperScan(basePackages = "top.luchchuan.health.mapper")
public class AppointmentApplication {
    public static void main(String[] args) {
        SpringApplication.run(AppointmentApplication.class, args);
    }
}
