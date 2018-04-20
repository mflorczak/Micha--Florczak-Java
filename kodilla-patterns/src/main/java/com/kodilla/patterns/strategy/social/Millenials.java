package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;

public class Millenials extends User {
    public Millenials(final String name) {
        super(name);
        socialPublisher = new FacebookPublisher();
    }
}
