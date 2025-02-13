package net.naji.observer;

import java.util.ArrayList;
import java.util.List;

public class Parametrage implements Observable{
    private List<Observer> observers = new ArrayList<>(); // Liste des observateurs (figures)
    private double epaisseurContour;
    private String couleurContour;
    private String couleurRemplissage;

    public Parametrage( double epaisseurContour, String couleurContour, String couleurRemplissage) {
        this.epaisseurContour = epaisseurContour;
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public double getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); // Ajouter un observateur à la liste
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); // Retirer un observateur de la liste
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(); // Notifier chaque observateur
        }
    }
}
