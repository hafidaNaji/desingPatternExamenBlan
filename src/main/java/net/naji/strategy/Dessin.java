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
    public void ajouterFigure(Figure figure) {
        figures.add(figure);
    }

    @Override
    public void supprimerFigure(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void afficher() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }

    @Override
    public void serialiser(String file) {
        System.out.println("Sérialisation du dessin dans le fichier : " + file);
    }

    @Override
    public void traiter() {
        if (strategy != null) {
            strategy.executer(this);
        } else {
            System.out.println("Aucune stratégie de traitement définie.");
        }
    }
}
