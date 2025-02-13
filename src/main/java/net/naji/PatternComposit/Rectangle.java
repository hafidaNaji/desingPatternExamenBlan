package net.naji.PatternComposit;

public class Rectangle extends Figure {
    private Point coinHautGauche; // Le coin supérieur gauche
    private double largeur; // La largeur du rectangle
    private double hauteur; // La hauteur du rectangle

    // Constructeur avec tous les paramètres nécessaires
    public Rectangle(String couleurContour, String couleurRemplissage, double epaisseurContour, Point coinHautGauche, double largeur, double hauteur) {
        super(couleurContour, couleurRemplissage, epaisseurContour); // Appel du constructeur parent
        this.coinHautGauche = coinHautGauche;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    // Méthode pour calculer la surface
    @Override
    public double calculerSurface() {
        return largeur * hauteur; // Surface = largeur * hauteur
    }

    // Méthode pour calculer le périmètre
    @Override
    public double calculerPerimetre() {
        return 2 * (largeur + hauteur); // Périmètre = 2 * (largeur + hauteur)
    }

    // Méthode pour dessiner le rectangle
    @Override
    public void dessiner() {
        System.out.println("Rectangle - Coin Supérieur Gauche: ");
        coinHautGauche.afficher();  // Afficher les coordonnées du coin supérieur gauche
        System.out.println("Largeur: " + largeur + ", Hauteur: " + hauteur +
                ", Contour: " + getCouleurContour() + ", Remplissage: " + getCouleurRemplissage() +
                ", Épaisseur Contour: " + getEpaisseurContour());
    }

    // Getters et setters
    public Point getCoinHautGauche() {
        return coinHautGauche;
    }

    public void setCoinHautGauche(Point coinHautGauche) {
        this.coinHautGauche = coinHautGauche;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
    @Override
    public void update() {
        // Mettre à jour les paramètres du rectangle lors du changement dans Parametrage
        super.update();  // Mettre à jour les couleurs et l'épaisseur
        System.out.println("Le rectangle a été mis à jour avec les nouveaux paramètres.");
    }

    @Override
    public void update(String couleurContour, String couleurRemplissage, double epaisseurContour) {

    }
}
