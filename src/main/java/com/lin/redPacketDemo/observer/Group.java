package com.lin.redPacketDemo.observer;

import com.lin.redPacketDemo.observer.Observer;
import com.lin.redPacketDemo.observer.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L
 */
public class Group implements Subject {
    List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
