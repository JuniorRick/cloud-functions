package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Slf4j
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    //curl -X POST http://localhost:8080/uppercase -H "Content-Type: text/plain" -d "hello world"
    @Bean
    public Function<String, String> uppercase() {
        return String::toUpperCase;
    }

    //curl -X POST http://localhost:8080/reverse -H "Content-Type: text/plain" -d "hello world"
    @Bean
    public Function<String, String> reverse() {
        return s -> new StringBuffer(s).reverse().toString();
    }

    //curl -X POST http://localhost:8080/newLine -H "Content-Type: text/plain" -d "hello world"
    @Bean
    public Function<String, String> newLine() {
        return s -> s + "\n";
    }

}