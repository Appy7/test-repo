package com.applicationproperties.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		SpringApplication.run(TestApplication.class, args);

		//List<Integer> i= Arrays.asList(9,8,1,2,3,4,5);
		//Integer k = i.stream().min((a,b)->a.compareTo(b)).get();
		//System.out.println(k);

		//System.out.println("Enter the String");
		//Scanner scanner = new Scanner(System.in);
		//System.out.println(" String is" + scanner);



	}

}
