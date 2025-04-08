package org.orlov.tom.notesservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class Application {
    public static void main(String[] args){
		//Test i have fixed
        SpringApplication.run(Application.class, args);
    }
}
