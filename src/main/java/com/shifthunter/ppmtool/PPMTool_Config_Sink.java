package com.shifthunter.ppmtool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class PPMTool_Config_Sink {

	public static void main(String[] args) {
		SpringApplication.run(PPMTool_Config_Sink.class, args);
	}

}
