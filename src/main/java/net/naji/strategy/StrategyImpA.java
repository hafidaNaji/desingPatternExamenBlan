package net.naji.strategy;

public class StrategyImpA implements Strategy {
    @Override
    public void executer(Dessin dessin) {
        System.out.println("Exécution de la stratégie A : Affichage des figures du dessin");
        dessin.afficher();  // Appel de la méthode afficher() du dessin
    }
}
