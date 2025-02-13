package net.naji.Observer;

public interface Observable {
    void addObserver(Observer observer); // Ajouter un observateur
    void removeObserver(Observer observer); // Retirer un observateur
    void notifyObservers(); // Notifier tous les observateurs d'un changement
}
