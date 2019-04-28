package cn.icloudit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekServer {

	public static void main(String[] args) {
		SpringApplication.run(EurekServer.class, args);
	}
}
