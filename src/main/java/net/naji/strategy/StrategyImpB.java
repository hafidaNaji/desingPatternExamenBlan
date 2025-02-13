package net.naji.strategy;

public class StrategyImpB implements Strategy{
    public void executer(Dessin dessin) {
        System.out.println("Exécution de la stratégie B : Sérialisation du dessin");
        dessin.serialiser("dessin.ser");  // Appel de la méthode serialiser() du dessin
    }
}
