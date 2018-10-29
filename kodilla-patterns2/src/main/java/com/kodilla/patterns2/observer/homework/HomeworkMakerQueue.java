package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class HomeworkMakerQueue implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String name;

    public HomeworkMakerQueue(String name){
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework){
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName(){
        return name;
    }

    public List<String> getHomeworks(){
        return homeworks;
    }
}

