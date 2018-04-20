package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;

public class ZGeneration extends User {
    public ZGeneration(final String user) {
        super(user);
        socialPublisher = new SnapchatPublisher();
    }
}
