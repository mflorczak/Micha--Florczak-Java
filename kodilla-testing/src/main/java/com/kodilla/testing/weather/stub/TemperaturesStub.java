package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public class TemperaturesStub implements Temperatures {
    @Override
    public HashMap<Integer, Double> getTemperatures() {
        HashMap<Integer, Double> stubResult = new HashMap<>();
        stubResult.put(0,25.4);
        stubResult.put(1,23.8);
        stubResult.put(2,26.7);
        stubResult.put(3,27.1);
        stubResult.put(4,30.1);

        return stubResult;
    }
}
