package net.naji.proxy;

public class Utilisateurs {
    private String nomUtilisateur="";
    private String motDePasse="";
    private String role="";  // Exemple de rôles: "admin", "user"

    public Utilisateurs(String un, String pwd, String r) {
       nomUtilisateur = un;
        motDePasse = pwd;
        role = r;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
