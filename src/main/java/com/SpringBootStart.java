package com;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;

import com.util.ScheduledTest;




@EnableScheduling
@SpringBootApplication
public class SpringBootStart {
	/**
	 * 定时 
	 * @param args
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootStart.class, args);
		ScheduledTest s=new ScheduledTest();
		s.executeUploadTask();
	}
}
