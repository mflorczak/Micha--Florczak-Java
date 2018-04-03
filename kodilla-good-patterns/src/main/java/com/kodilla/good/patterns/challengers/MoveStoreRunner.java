package com.kodilla.good.patterns.challengers;

import java.util.stream.Collectors;

public class MoveStoreRunner {
    public static void main(String[] args) {
        MoveStore moveStore = new MoveStore();
        String allMovies;
        allMovies = moveStore.getMovies().entrySet().stream()
                .map(e -> e.getValue())
                .flatMap(l -> l.stream())
                .collect(Collectors.joining("!"));
        System.out.println(allMovies);
    }
}
