package kr.co.fos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@MapperScan("co.kr.fos")
@ComponentScan(basePackages= {"co.kr.fos"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class FoodtruckApplication {
	public static void main(String[] args) {
		SpringApplication.run(FoodtruckApplication.class, args);
	}

}
