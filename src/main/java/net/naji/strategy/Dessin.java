package net.naji.strategy;

import net.naji.patternComposit.Figure;

import java.util.ArrayList;
import java.util.List;

public class Dessin implements DessinInterface {
    private List<Figure> figures;
    private Strategy strategy;

    // Constructeur pour initialiser la liste de figures
    public Dessin() {
        figures = new ArrayList<>();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    @Override
    // Ajouter une figure au dessin
    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    @Override
    // Supprimer une figure au dessin
    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    // Afficher toutes les figures du dessin
    public void afficher() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }

    @Override
    // Sérialiser le dessin dans un fichier binaire
    public void serialiser(String file) {
        System.out.println("Sérialisation du dessin dans le fichier : " + file);
    }

    // Méthode pour traiter le dessin selon la stratégie actuelle
    @Override
    public void traiter() {
        if (strategy != null) {
            strategy.executer(this);
        } else {
            System.out.println("Aucune stratégie de traitement définie.");
        }

    }
}
