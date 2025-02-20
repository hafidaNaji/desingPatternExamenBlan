package net.naji;

import net.naji.observer.Observer;
import net.naji.patternComposit.*;
import net.naji.observer.*;
import net.naji.progOrAspect.SessionUtilisateur;
import net.naji.progOrAspect.Utilisateur;
import net.naji.strategy.Dessin;
import net.naji.strategy.StrategyImpA;
import net.naji.strategy.StrategyImpB;
import java.util.ArrayList;
import java.util.List;

public class Main {
 public static void main(String[] args) {
  System.out.println("===========Pattern Strategy============");

  // Création de points pour les figures
  Point centreCercle = new Point(2, 3);
  Point coinRectangle = new Point(1, 1);

  // Création de l'objet Parametrage

  // Création des figures avec le Parametrage
  Figure cercle1 = new Cercle("Rouge", "Jaune", 2.0, centreCercle, 5.0);
  Figure rectangle1 = new Rectangle("Bleu", "Vert", 3.0, coinRectangle, 4.0, 6.0);

  // Affichage des figures avant mise à jour
  cercle1.dessiner();
  rectangle1.dessiner();

  System.out.println("===========Pattern Observer============");

  // Ajout des figures aux observateurs
  List<Observer> observers = new ArrayList<>();
  observers.add(cercle1);
  observers.add(rectangle1);

  // Parametrage pour la mise à jour des figures
  Parametrage parametrage1 = new Parametrage(2.5, "Violet", "Orange");

  // Ajout des observateurs au Parametrage
  for (Observer observer : observers) {
   parametrage1.addObserver(observer);
  }

  System.out.println("\n===========Mise à jour des paramètres============");

  // Mise à jour des paramètres du Parametrage
  parametrage1.setCouleurContour("Rouge");
  parametrage1.setCouleurRemplissage("Gris");
  parametrage1.setEpaisseurContour(5.0);
  parametrage1.notifyObservers();

  // Affichage des figures après mise à jour
  cercle1.dessiner();
  rectangle1.dessiner();

  System.out.println("===========Pattern Strategy============");

  // Création du dessin et ajout des figures
  Dessin dessin = new Dessin();
  dessin.ajouterFigure(cercle1);
  dessin.ajouterFigure(rectangle1);

  // Choisir la stratégie d'affichage
  dessin.setStrategy(new StrategyImpA());
  dessin.traiter();  // Affichage des figures

  // Stratégie de sérialisation
  dessin.setStrategy(new StrategyImpB());
  dessin.traiter();  // Sérialisation des figures

  System.out.println("*****************AspectJ***************");

  // Utilisateur avec rôle ADMIN
  Utilisateur admin = new Utilisateur("admin", "ADMIN");
  SessionUtilisateur.connecter(admin);
  dessin.ajouterFigure(new Cercle("Noir", "Blanc", 1.0, new Point(0, 0), 5.0));  // Devrait fonctionner

  // Utilisateur sans rôle ADMIN
  Utilisateur user = new Utilisateur("user", "USER");
  SessionUtilisateur.connecter(user);

  try {
   dessin.ajouterFigure(new Rectangle("Noir", "Blanc", 1.0, new Point(0, 0), 10.0, 20.0));  // Devrait échouer
  } catch (SecurityException e) {
   System.out.println(e.getMessage());  // Affiche "Accès refusé : Vous n'avez pas les droits nécessaires."
  }
 }
}
