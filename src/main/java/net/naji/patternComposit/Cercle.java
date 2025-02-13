package net.naji.patternComposit;

public class Cercle extends Figure {
    private Point centre; // Centre du cercle
    private double rayon; // Rayon du cercle

    // Constructeur avec tous les paramètres nécessaires (y compris le centre et le rayon)
    public Cercle(String couleurContour, String couleurRemplissage, double epaisseurContour, Point centre, double rayon) {
        super(couleurContour, couleurRemplissage, epaisseurContour); // Appel du constructeur parent
        this.centre = centre; // Initialisation du centre
        this.rayon = rayon; // Initialisation du rayon
    }

    // Méthode pour calculer la surface du cercle
    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon; // Surface = π * rayon²
    }

    // Méthode pour calculer le périmètre du cercle
    @Override
    public double calculerPerimetre() {
        return 2 * Math.PI * rayon; // Périmètre = 2 * π * rayon
    }

    // Méthode pour dessiner le cercle
    @Override
    public void dessiner() {
        System.out.println("Cercle - Centre: ");
        centre.afficher();  // Afficher les coordonnées du centre
        System.out.println("Rayon: " + rayon + ", Contour: " + getCouleurContour() +
                ", Remplissage: " + getCouleurRemplissage() + ", Épaisseur Contour: " + getEpaisseurContour());
    }

    // Getters et setters
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }
    @Override
    public void update() {
        // Mettre à jour les paramètres du cercle lors du changement dans Parametrage
        super.update();  // Mettre à jour les couleurs et l'épaisseur
        System.out.println("Le cercle a été mis à jour avec les nouveaux paramètres.");
    }

    @Override
    public void update(String couleurContour, String couleurRemplissage, double epaisseurContour) {

    }
}
