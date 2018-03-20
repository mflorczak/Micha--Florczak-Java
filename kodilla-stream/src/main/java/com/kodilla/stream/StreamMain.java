package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

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
        poemBeautifier.beautify("text", (text) -> text.toUpperCase());
        poemBeautifier.beautify("text",(text) -> "./" + text + "\\.");
    }
}
