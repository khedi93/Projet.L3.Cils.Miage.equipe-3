package classes;



import java.io.*;


public class Compte {
    
    static long num=1;
    double solde;
    long numero;
    Personne proprietaire;
    boolean compt;
    String operation;
    String mdp;
    String rib;
    
    /* constructeurs */
    public Compte(double solde,Personne proprietaire,String mdp,String rib){
        numero=num++;
        this.solde=solde;
        this.proprietaire=proprietaire;
        compt=true;
        operation=" ";
        this.mdp=mdp;
        this.rib=rib;
    }
    Compte() throws IOException {
        System.out.println("Entrez le solde de départ :");
        solde =Clavier.lireDouble();
        numero =num++;
        compt=true;
        proprietaire = new Personne();
        operation=" ";
        System.out.println("Entrez un mot de passe :");
        mdp=Clavier.lireString();
        System.out.println("Entrez un RIB :");
        rib=Clavier.lireString();
        
    }
    // Méthodes
    void ouvrircompte(){
        compt=true;
    }
    void fermercompte(){
        compt=false;
    }
    boolean test(){
        if(compt==true)
            return true;
        else
            return false;
    }
    
    double avoirSolde(){return(solde);}
    long avoirNumero(){return(numero);}
    
    void deposer(double s){
        if(test()){
            solde=solde +s;
            operation=operation+"\nAjout de "+s+"€ sur le compte ";
        } else System.out.println("Compte fermé");
    }
    
    boolean retirer(double s) {
        if(test())
            if ((solde - s) >= 0) {
            solde=solde - s;
            operation=operation+"\nRetrait de "+s+"€ sur le compte ";
            return(true);
            } else
                return(false);
        else {System.out.println("Compte fermé"); return false;}
    }
    
    public String toString() {
        return numero + ";" + solde+";"+proprietaire;
    }
    
    void virer(double s, Compte vers) {
        if (retirer(s)){
            vers.deposer(s);
            operation=operation+"correspond au virement de "+s+"€ sur le compte "+vers.numero;
        } else
            System.out.println("Erreur, impossible de retirer "+s+" du compte "+numero);
    }
    
    void impSolde() {
        proprietaire.impCoord();
        System.out.println("Votre compte " + numero + " a un solde de " + solde);
    }
    public void affiche(){
        System.out.println("Compte né : "+numero+"\nSolde : "+solde+"€");
        proprietaire.affiche();
        
    }
    
    public String operation(){
        return operation;
    }
    
}



