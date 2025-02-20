package net.naji.progOrAspect;

public class Utilisateur {
    private String username=" ";
    private String role= " ";

    // Constructeur
    public Utilisateur(String username, String role) {
        this.username = username;
        this.role = role;
    }

    // Méthode pour vérifier si l'utilisateur a le rôle requis
    public boolean hasRequiredRole() {
        // Exemple de vérification de rôle
        return "admin".equals(this.role); // Remplacer par votre logique de rôle
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
}
