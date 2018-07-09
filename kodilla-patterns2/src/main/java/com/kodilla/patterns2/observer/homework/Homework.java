package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private List<Observer> observers;
    private List<String> links;
    private final String username;

    public Homework(String username) {
        this.username = username;
        links = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addHomework(String link) {
        links.add(link);
        notifyObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public List<String> getLinks() {
        return links;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
