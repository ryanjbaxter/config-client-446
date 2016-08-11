package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@EnableConfigurationProperties(MineProperties.class)
@RestController
public class SpringCloudConfigClientApplication {

	@Autowired
	private MineProperties props;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientApplication.class, args);
	}

	@RequestMapping("/")
	public Mine[] getMyProps() {
		return props.getMines();
	}
}
