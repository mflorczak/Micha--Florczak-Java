package com.kodilla.good.patterns.challengers;

public class Ball implements Item {
    private String ballName;

    public Ball(final String ballName) {
        this.ballName = ballName;
    }

    public String getBallName() {
        return ballName;
    }

    @Override
    public String getNameItem() {
        return getBallName();
    }
}
