package net.naji.PatternComposit;

public class Point {
    private double x;
    private double y;

    // Constructeur pour initialiser les coordonnées x et y
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Méthode pour afficher les coordonnées
    public void afficher() {
        System.out.println("Coordonnée (x, y) : (" + x + ", " + y + ")");
    }

    // Getters et setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
