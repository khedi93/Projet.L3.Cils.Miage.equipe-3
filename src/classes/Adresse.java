
package classes;

import java.io.*;



public class Adresse {
    
    int numero;
    String rue;
    String ville;
    long code_postal;
    
    
    /* constructeurs */
    Adresse() throws IOException {
        System.out.println("Numéro de rue :");
        numero=Clavier.lireInt();
        
        System.out.println("Code postal :");
        code_postal=Clavier.lireLong();
        
        System.out.println("Rue :");
        rue=Clavier.lireString();
        
        System.out.println("Ville :");
        ville=Clavier.lireString();
    }
    public Adresse(int numero,String rue,String ville,long code_postal){
        this.numero=numero;
        this.rue=rue;
        this.ville=ville;
        this.code_postal=code_postal;
    }
    
    
    public String toString(){
        return numero+";"+rue+";"+ville+";"+code_postal;
    }
}
