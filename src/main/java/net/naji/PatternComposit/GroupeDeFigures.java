package net.naji.PatternComposit;

import java.util.ArrayList;
import java.util.List;

public class GroupeDeFigures extends Figure{
    private List<Figure> figures;


    public GroupeDeFigures(String couleurContour, String couleurRemplissage, double epaisseurContour) {
        super(couleurContour, couleurRemplissage, epaisseurContour);
        figures = new ArrayList<>();
    }
    public void ajouter(Figure figure) {
        figures.add(figure);
    }
    public void retirer(Figure figure) {
        figures.remove(figure);
    }


    @Override
    public double calculerSurface() {
        double surfaceTotale = 0;
        for (Figure figure : figures) {
            surfaceTotale += figure.calculerSurface();
        }
        return surfaceTotale;
    }

    @Override
    public double calculerPerimetre() {
        double perimetreTotal = 0;
        for (Figure figure : figures) {
            perimetreTotal += figure.calculerPerimetre();
        }
        return perimetreTotal;
    }

    @Override
    public void dessiner() {
        // Dessiner chaque figure du groupe
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
// Méthode de l'interface Observer pour mettre à jour les propriétés du groupe de figures
@Override
public void update(String couleurContour, String couleurRemplissage, double epaisseurContour) {
        System.out.println("Mise à jour des paramètres du groupe de figures...");
        this.setCouleurContour(couleurContour);
        this.setCouleurRemplissage(couleurRemplissage);
        this.setEpaisseurContour(epaisseurContour);

        // Mettre à jour chaque figure contenue dans le groupe
        for (Figure figure : figures) {
            figure.update(couleurContour, couleurRemplissage, epaisseurContour);  // Notifier chaque figure
        }
    }
}
