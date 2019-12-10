package com.huyaoban.google;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ComponentScan

// 启用Spring Boot的自动配置
// @EnableAutoConfiguration
@SpringBootApplication
public class GoogleDemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(Application.class, args);

		SpringApplication app = new SpringApplication(GoogleDemoApplication.class);
		// 关闭banner
		// app.setBannerMode(Mode.OFF);
		app.run(args);
	}

}
