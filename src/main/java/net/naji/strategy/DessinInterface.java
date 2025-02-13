package net.naji.strategy;

import net.naji.patternComposit.Figure;

public interface DessinInterface {
    // Ajouter une figure au dessin
    void ajouterFigure(Figure figure);

    // Supprimer une figure du dessin
    void supprimerFigure(Figure figure);

    // Afficher toutes les figures du dessin
    void afficher();
    // Sérialiser le dessin dans un fichier binaire
    void serialiser(String filename);
    // Traitement du dessin en utilisant la stratégie choisie
    void traiter();
}
