package net.naji;

import net.naji.observer.Observer;
import net.naji.patternComposit.*;
import net.naji.observer.*;
import net.naji.strategy.Dessin;
import net.naji.strategy.StrategyImpA;
import net.naji.strategy.StrategyImpB;
import java.util.ArrayList;
import java.util.List;



public class Main {
    public static void main(String[] args) {
       System.out.println("===========Pattern Composit============");

        // Création de points pour les figures
        Point centreCercle = new Point(2, 3);  // Le centre du cercle
        Point coinRectangle = new Point(1, 1); // Le coin du rectangle

        // Création de figures individuelles avec les bons constructeurs
        Figure cercle1 = new Cercle("Rouge", "Jaune", 2, centreCercle, 5);  // Constructeur de Cercle
        Figure rectangle1 = new Rectangle("Bleu", "Vert", 3, coinRectangle, 4, 6);  // Constructeur de Rectangle

        // Affichage des figures avant mise à jour
        cercle1.dessiner();
        rectangle1.dessiner();

        System.out.println("===========Pattern Observer============");

        // Ajout des figures à la liste des observateurs
        List<Observer> observers = new ArrayList<>();
        observers.add(cercle1);
        observers.add(rectangle1);

        // Création du Parametrage avec des paramètres à changer
        Parametrage parametrage = new Parametrage(2.5, "Violet", "Orange");

        // Ajout des observateurs au Parametrage
        for (Observer observer : observers) {
            parametrage.addObserver(observer);
        }

        // Notifier les observateurs avant changement
        System.out.println("\n===========Mise à jour des paramètres============");
        parametrage.setCouleurContour("Rouge");
        parametrage.setCouleurRemplissage("Gris");
        parametrage.setEpaisseurContour(5.0);

        // Notifier tous les observateurs (les figures) pour les mettre à jour
        parametrage.notifyObservers();

        // Affichage des figures après mise à jour
        cercle1.dessiner();
        rectangle1.dessiner();

        System.out.println("===========Pattern Strategy============");

        // Création d'un dessin et ajout des figures
        Dessin dessin = new Dessin();
        dessin.ajouterFigure(cercle1);
        dessin.ajouterFigure(rectangle1);

        // Choisir la stratégie : Affichage des figures
        dessin.setStrategy(new StrategyImpA());  // Stratégie A (Affichage)

        // Appliquer la stratégie : Affichage
        dessin.traiter();  // Utilise la stratégie d'affichage

        // Changer la stratégie : Sérialisation du dessin
        dessin.setStrategy(new StrategyImpB());  // Stratégie B (Sérialisation)

        // Appliquer la stratégie : Sérialisation
        dessin.traiter();  // Utilise la stratégie de sérialisation

    }
}