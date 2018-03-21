package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;

import static com.kodilla.stream.iterate.NumbersGenerator.generateEven;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 7, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,3, (a, b) -> a * b);
        expressionExecutor.executeExpression(33,11, (a, b) -> a / b);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("text",(text) -> "AAA" + text + "AAA");
        poemBeautifier.beautify("text",(text) -> "*****" + text + "*****");
        poemBeautifier.beautify("text", String::toUpperCase);
        poemBeautifier.beautify("text",(text) -> "./" + text + "\\.");

        System.out.println("Using Stream to generate even numbers form 1 to 20");
        generateEven(20);
    }
}
