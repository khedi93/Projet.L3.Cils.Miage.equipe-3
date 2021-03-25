package classes;



import java.util.ArrayList;
import java.io.*;
import java.util.Collection;


public class Listecompte {
    private ArrayList<Compte> liste ;
    /* constructeurs */
    public Listecompte() {
        liste = new ArrayList();
    }
    
    public boolean estvide(){
        return liste.isEmpty();
    }
    public void ajouter(Compte o){
        liste.add(o);
    }
    public void radier(Compte o){
        liste.remove(o);
    }
    public boolean contient(Compte o){
        return liste.contains(o);
    }
    public int cardinal(){
        return liste.size();
    }
    public String toString(){
        return liste.toString();
    }
    public ArrayList<Compte> getListe(){
        return liste;
    }
    
}
