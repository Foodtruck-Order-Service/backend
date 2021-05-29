package kr.co.fos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "kr.co.fos" })
@MapperScan(basePackages = "kr.co.fos")
public class FoodtruckApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);
	}

}
