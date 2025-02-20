package net.naji.observer;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private double epaisseurContour;
    private String couleurContour;
    private String couleurRemplissage;

    public Parametrage(double epaisseurContour, String couleurContour, String couleurRemplissage) {
        this.epaisseurContour = epaisseurContour;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();  // notify each observer with 'this' Parametrage instance
        }
    }

    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    // Getters for the fields if needed

    public List<Observer> getObservers() {
        return observers;
    }

    public double getEpaisseurContour() {
        return epaisseurContour;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }
}


