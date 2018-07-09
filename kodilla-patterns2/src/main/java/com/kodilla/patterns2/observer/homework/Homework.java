package com.kodilla.patterns2.observer.homework;

import com.kodilla.patterns2.observer.forum.Observable;
import com.kodilla.patterns2.observer.forum.Observer;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private List<com.kodilla.patterns2.observer.homework.Observer> observers;
    private List<String> links;
    private final String name;

    public Homework(String name) {
        this.name = name;
        links = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addHomework(String link) {
        links.add(link);
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer)
    }

    @Override
    public void registerObserver(com.kodilla.patterns2.observer.homework.Observer observer) {

    }

    @Override
    public void notifyObservers() {
        for(com.kodilla.patterns2.observer.homework.Observer observer: observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(com.kodilla.patterns2.observer.homework.Homework observer) {

    }
}
