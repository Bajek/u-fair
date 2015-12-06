package pl.ubytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
public class Server
{
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);

    }
}
