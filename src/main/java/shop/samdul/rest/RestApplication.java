package shop.samdul.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApplication.class, args);

        System.out.println(5);
        System.out.println(4);
        System.out.println(3);
        System.out.println(2);
        System.out.println(1);
        System.out.println("GO! GO! GO!");
    }

}
