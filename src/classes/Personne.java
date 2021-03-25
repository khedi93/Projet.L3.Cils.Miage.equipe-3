package classes;



import java.io.*;


public class Personne {
    
    static int comptnumero=1;
    String nom;
    String prenom;
    Adresse adress;
    String num_tel;
    String date_naiss;
    char sexe;
    String etat_civil;
    int numero;
    
    /* constructeurs */
    public Personne(String nom,String prenom,Adresse adresse,String num_tel,String date_naiss,char sexe,String etat_civil){
        numero=comptnumero++;
        this.nom=nom;
        this.prenom=prenom;
        this.adress=adresse;
        this.num_tel=num_tel;
        this.date_naiss=date_naiss;
        this.sexe=sexe;
        this.etat_civil=etat_civil;
    }
    Personne() throws IOException {
        numero=comptnumero++;
        System.out.println("Nom :");
        nom=Clavier.lireString();
        
        System.out.println("Prénom :");
        prenom=Clavier.lireString();
        
        System.out.println("Numéro de téléphone :");
        num_tel=Clavier.lireString();
        
        System.out.println("Date de naissance :");
        date_naiss=Clavier.lireString();
        
        System.out.println("Sexe :");
        sexe=Clavier.lireChar();
        
        System.out.println("Etat civil :");
        etat_civil=Clavier.lireString();
        
        adress = new Adresse();
    }
    
    public void impCoord() {
        System.out.println("Nom : "+nom+"\nPrénom : "+prenom);
    }
    public void affiche(){
        System.out.println("Etat civil : "+etat_civil+"\nNom : "+nom+"\nPrénom :"+prenom+"\nSexe : "+sexe+"\nDate de naissance : "+date_naiss+"\nNuméro de tel : "+num_tel+"\nAdresse :Né :"+adress.numero+" Rue : "+adress.rue+" Ville : "+adress.ville+" Code postal : "+adress.code_postal);
    }
    
    public String toString(){
        return numero+";"+etat_civil+";"+nom+";"+prenom+";"+sexe+";"+adress+";"+num_tel+";"+date_naiss+";\n";
    }
}