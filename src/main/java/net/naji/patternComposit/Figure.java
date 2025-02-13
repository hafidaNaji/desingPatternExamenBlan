package net.naji.patternComposit;
import net.naji.observer.Observer;

public abstract class Figure implements Observer {
    private String couleurContour;
    private String couleurRemplissage;
    private double epaisseurContour;

    public Figure(String couleurContour, String couleurRemplissage, double epaisseurContour) {
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        this.epaisseurContour = epaisseurContour;
    }
    // Méthodes abstraites que chaque figure devra implémenter
    public abstract double calculerSurface();
    public abstract double calculerPerimetre();
    public abstract void dessiner();

    // Méthode de l'interface Observer qui sera appelée lorsque les paramètres changent
    @Override
    public void update() {
        // Mettre à jour les propriétés de la figure lorsque le paramétrage change
        // Par exemple, ici on met à jour les couleurs et l'épaisseur du contour
        System.out.println("Mise à jour des paramètres de la figure...");
        this.couleurContour = "Couleur mise à jour";  // Remplacez par les valeurs réelles du Parametrage
        this.couleurRemplissage = "Couleur mise à jour";  // Remplacez par les valeurs réelles
        this.epaisseurContour = 2.0;  // Remplacez par la nouvelle épaisseur du contour
    }
    //Getters et Setters
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

    public double getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    // Méthode de l'interface Observer pour mettre à jour les propriétés du groupe de figures
        public abstract void update(String couleurContour, String couleurRemplissage, double epaisseurContour);
}
