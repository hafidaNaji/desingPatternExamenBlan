
package net.naji.progOrAspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionUtilisateur {
    private static Utilisateur utilisateurActuel;
    private static final Logger log = LoggerFactory.getLogger(SessionUtilisateur.class);  // Déclaration du logger

    public static void connecter(Utilisateur utilisateur) {
        utilisateurActuel = utilisateur;  // Assure que l'utilisateur est bien connecté
        log.info("Utilisateur connecté : " + utilisateurActuel.getUsername());  // Log de la connexion de l'utilisateur
    }

    public static Utilisateur getUtilisateurActuel() {
        return utilisateurActuel;
    }

    public static void checkUserRole() {
        if (utilisateurActuel == null) {
            throw new SecurityException("Accès refusé : Aucun utilisateur connecté.");
        }

        String role = utilisateurActuel.getRole();  // Récupérer le rôle de l'utilisateur
        log.info("Rôle de l'utilisateur actuel : " + role);  // Log du rôle de l'utilisateur

        if (!role.equals("admin")) {
            throw new SecurityException("Accès refusé : Vous n'avez pas les droits nécessaires.");
        }
    }

    public static boolean estConnecte() {
        return utilisateurActuel != null;
    }
}


