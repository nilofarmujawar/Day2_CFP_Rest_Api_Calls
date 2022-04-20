package com.example.cfp2;

/**
 * import classs
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1) @SpringBootApplication :-
 *                The @SpringBootApplication annotation is a convenience annotation that combines the @EnableAutoConfiguration,
 *                @Configuration and the @ComponentScan annotations in a Spring Boot application.
 *                These annotations do the following: @EnableAutoConfiguration – This enables Spring Boot's autoconfiguration mechanism.
 */
@SpringBootApplication
/**
 * create class name as HelloRestControllerApplication
 */
public class HelloRestControllerApplication {

	/**
	 * create a main method,all program execute in main method.
	 * @param args - no arguments ,its default
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloRestControllerApplication.class, args);
	}

}
