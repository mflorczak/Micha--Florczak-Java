package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape choosenShape() {
        Shape theShape;
        Random random = new Random();
        int choose = random.nextInt(3);

        if(choose == 0) {
            theShape = new Triangle();
        } else if(choose == 1) {
            theShape = new Circle();
        } else {
            theShape = new Square();
        }
        return theShape;
    }
}
