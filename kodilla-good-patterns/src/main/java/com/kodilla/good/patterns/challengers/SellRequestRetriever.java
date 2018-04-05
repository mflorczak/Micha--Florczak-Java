package com.kodilla.good.patterns.challengers;

import java.time.LocalDate;

public class SellRequestRetriever {
    public SellRequest sellRequest() {
        User user = new User("John", "Smith");
        LocalDate date = LocalDate.now();
        Game game = new Game("FIFA 18");

        return new SellRequest(user, date, game);
    }



}
