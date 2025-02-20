package net.naji.progOrAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

@Aspect
public class JournalisationAspect {

    Logger logger = LoggerFactory.getLogger(JournalisationAspect.class.getName());
    long startTime;
    long endTime;

    // Aspect autour des méthodes (avant et après leur exécution)
    @Pointcut("execution(* net.naji..*(..))")
    public void pc1(){}

    @Before("pc1()")
    public void avant(JoinPoint joinPoint) {
        // Log avant l'exécution de la méthode
        startTime = System.currentTimeMillis();
        logger.info("------------------------------------------");
        logger.info("Avant l'exécution de la méthode: " + joinPoint.getSignature());
    }

    @After("pc1()")
    public void apres(JoinPoint joinPoint) {
        // Log après l'exécution de la méthode
        endTime = System.currentTimeMillis();
        logger.info("Après l'exécution de la méthode: " + joinPoint.getSignature());
        logger.info("Durée d'exécution de la méthode: " + (endTime - startTime) + " ms");
        logger.info("------------------------------------------------------");
    }
}
