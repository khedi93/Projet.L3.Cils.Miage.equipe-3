public class Personne implements java.io.Serializable{
    private String nom = "";
    private String prenom ="";
    private int taille = 0;

    public Personne(final String nom, final String prenom, final int taille){
        this.nom = nom;
        this.taille = taille;
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }
    public void setNom(final String nom) {
        this.nom = nom;
    }
    public int getTaille(){
        return this.taille;
    }

    public void setTaille(final int taille) {
        this.taille = taille;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setPrenom(final String prenom){
        this.prenom = prenom;
    }
}

