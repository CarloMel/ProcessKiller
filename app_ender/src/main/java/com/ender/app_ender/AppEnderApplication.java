package com.ender.app_ender;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppEnderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AppEnderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		start();
	}

	public static void start() {

		ProcessKiller pk = new ProcessKiller();

		// Custom List to terminate
		List<String> startUpList = new ArrayList<>();
		startUpList.add("Test");
		startUpList.add("Test2");
		startUpList.add("Test3");

		System.out.println("----------------------------------------------");
		System.out.println("Closing processes of this list: "
		+ startUpList);
		System.out.println("----------------------------------------------");
		pk.setListToKill(startUpList);
		pk.killList();
	}


}
