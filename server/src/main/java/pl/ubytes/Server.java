package pl.ubytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration
@ComponentScan
@EnableWebMvc
public class Server
{
    public static void main(String[] args) {
        SpringApplication.run(Server.class, args);

    }
}
