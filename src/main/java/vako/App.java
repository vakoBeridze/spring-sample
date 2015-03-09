package vako;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by abesalomi.
 * Created at 3/9/15 10:51 AM.
 * Created for spring-sample.
 */
@ComponentScan
@EnableAutoConfiguration
public class App {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class,args);
    }

}
