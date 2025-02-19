package net.naji.progOrAspect;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class JournalisationAspect {
    // Avant l'exécution de chaque méthode de la classe Main
    @Before("execution(* net.naji.*.main(..))")
    public void avantMethod() {
        System.out.println("Début de la méthode...");
    }

    // Après l'exécution de chaque méthode de la classe Main
    @After("execution(* net.naji.*.main(..))")
    public void apresMethod() {
        System.out.println("Fin de la méthode...");
    }
}
