package com.shifthunter.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class PpmToolSpringCloudM3ConfigSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(PpmToolSpringCloudM3ConfigSinkApplication.class, args);
	}

}
