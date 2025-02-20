package net.naji.patternComposit;
import net.naji.observer.Observer;
import net.naji.observer.Parametrage;

public abstract class Figure implements Observer {
    private String couleurContour;
    private String couleurRemplissage;
    private double epaisseurContour;
    private Parametrage parametrage; // Référence à Parametrage


    public Figure(String couleurContour, String couleurRemplissage, double epaisseurContour) {
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        this.epaisseurContour = epaisseurContour;
        this.parametrage = parametrage; // Initialisation de l'objet Parametrage
    }
    // Méthode qui va accéder à l'objet Parametrage
    public Parametrage getParametrage() {
        return parametrage;
    }
    // Méthodes abstraites que chaque figure devra implémenter
    public abstract double calculerSurface();
    public abstract double calculerPerimetre();
    public abstract void dessiner();

    // Méthode de l'interface Observer qui sera appelée lorsque les paramètres changent
    @Override
    public void update() {
        // Mettre à jour les propriétés de la figure avec les vrais paramètres
        if (parametrage != null) {  // Vérifie si l'objet parametrage est non-null
            this.couleurContour = parametrage.getCouleurContour();
            this.couleurRemplissage = parametrage.getCouleurRemplissage();
            this.epaisseurContour = parametrage.getEpaisseurContour();
        } else {
            // Si parametrage est null, tu pourrais gérer le cas ici, par exemple en journalisant un message d'erreur
            System.out.println("Erreur: L'objet Parametrage est null.");
        }
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
