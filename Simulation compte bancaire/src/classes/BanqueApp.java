package classes;



import java.util.ArrayList;

import gui.Gui;

import java.io.*;



public class BanqueApp {
    
    public static void main(String[] args) throws IOException, InterruptedException{
        System.out.println( "-------------------------------------------" );
        System.out.println( "BIENVENUE DANS LA BANQUE DE FRANCE " );
        System.out.println( "-------------------------------------------" );
        
        new BanqueApp();
       
    }
    
    private static void Erreur(Exception e, int code){
        System.err.println("Erreur : "+e);
        System.exit(code);
    }//Erreur
    
    /* constructeurs */
    public BanqueApp() throws IOException, InterruptedException{
        Listecompte listc = new Listecompte();
        // ouverture du fichier
        BufferedReader IN=null;
        try{
            IN= new BufferedReader(new FileReader("list"));
        } catch (Exception e){
            Erreur(e,1);
        }
// données
        String ligne=null;
        String[] champs=null;
        int numero;
        String rue;
        String ville;
        long code_postal;
        String nom;
        String prenom;
        String num_tel;
        String date_naiss;
        char sexe;
        String etat_civil;
        double solde;
        String mdp;
        String rib;
// gestion des éventuelles erreurs
        try{
            while(((ligne=IN.readLine())).charAt(0)!=']'){
                champs=ligne.split(";");
                solde=Double.parseDouble(champs[1]);
                etat_civil=champs[3];
                nom=champs[4];
                prenom=champs[5];
                sexe=champs[6].charAt(0);
                numero=Integer.parseInt(champs[7]);
                rue=champs[8];
                ville=champs[9];
                code_postal=Long.parseLong(champs[10]);
                num_tel=champs[11];
                date_naiss=champs[12];
                Adresse adres=new Adresse(numero,rue,ville,code_postal);
                Personne p = new Personne(nom,prenom,adres,num_tel,date_naiss,sexe,etat_civil);
                mdp=champs[13];
                rib=champs[14];
                listc.ajouter(new Compte(solde,p,mdp,rib));
            }
        }// fin while
        catch (Exception e){
            Erreur(e,2);
        }
// fermeture fichier
        try{
            IN.close();
        } catch (Exception e){
            Erreur(e,3);
        }
        
        
        int size=0;
        int choix=0;
        while(choix!=12){
            System.out.println("\n1.  Creer un nouveau compte.");
            System.out.println("2.  Radier un client.");
            System.out.println("3.  Ouvrir un compte.");
            System.out.println("4.  Fermer un compte.");
            System.out.println("5.  Afficher information d'un compte.");
            System.out.println("6.  Déposer de l'argent sur un compte.");
            System.out.println("7.  Retirer de l'argent sur un compte.");
            System.out.println("8.  Effectuer un virement.");
            System.out.println("9.  Afficher le solde d'un compte.");
            System.out.println("10. Afficher les dernieres opération sur le compte.");
            System.out.println("11. Afficher tous les comptes");
            System.out.println("12.  Quitter");
            
            System.out.println("Il y a "+listc.cardinal()+" compte");
            size=listc.cardinal();
            
            System.out.println("\nEntrer votre choix : ");
            choix=Clavier.lireInt();
            switch(choix){
                case 1 : listc.ajouter(new Compte()); System.out.println("Votre compte a bien été créé");Thread.sleep( 5000 );
                
                case 2 : System.out.println("Entrer le numéro du client : ");
                int nc=Clavier.lireInt()-1;
                if(nc<size){
                    listc.radier(listc.getListe().get(nc));
                    System.out.println("Votre compte a bien été suprimmé ");} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 3 : System.out.println("Entrer le numéro du client : ");
                int nb=Clavier.lireInt()-1;
                if(nb<size){
                    listc.getListe().get(nb).ouvrircompte();
                    System.out.println("Votre compte a bien été ouvert");} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 4 : System.out.println("Entrer le numéro du client : ");
                int nd=Clavier.lireInt()-1;
                if(nd<size){
                    listc.getListe().get(nd).fermercompte();
                    System.out.println("Votre compte a bien été fermé");} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 5 : System.out.println("Entrer le numero du client : ");
                int n=Clavier.lireInt()-1;
                if(n<size)
                    listc.getListe().get(n).affiche();
                else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 6 : System.out.println("Entrer le numero du client : ");
                int ne=Clavier.lireInt()-1;double s=0;;
                if(ne<size){
                    System.out.println("Entrer la somme à déposer :");
                    s=Clavier.lireDouble();
                    listc.getListe().get(ne).deposer(s);
                    if(listc.getListe().get(ne).test())
                    System.out.println("Vous venez de déposer "+s+" sur le compte numéro "+ ++ne);
                } else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 7 : System.out.println("Entrer le numero du client : ");
                int nf=Clavier.lireInt()-1;double sa=0;
                if(nf<size){
                    System.out.println("Entrer la somme à retirer :");
                    sa=Clavier.lireDouble();
                    listc.getListe().get(nf).retirer(sa);
                    if(listc.getListe().get(nf).test())
                    System.out.println("Vous venez de retirer "+sa+" sur le compte numéro "+ ++nf);
                } else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 8 : System.out.println("Entrer le numero du client du premier compte : ");
                int nh=Clavier.lireInt()-1;int nh2=0;double vir=0;
                if(nh<size){
                    System.out.println("Entrer le numero du client du deuxieme compte: ");
                    nh2=Clavier.lireInt()-1;
                    if(nh2<size){
                        System.out.println("Entrer la somme du virement :");
                        vir=Clavier.lireDouble();
                        listc.getListe().get(nh).virer(vir,listc.getListe().get(nh2));
                        if(listc.getListe().get(nh).test() && listc.getListe().get(nh2).test())
                        System.out.println("Vous venez d'effectuer un virement du compte "+ ++nh +" au compte "+ ++nh2 +" d'une somme de "+vir+"");
                    }} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 9 : System.out.println("Entrer le numero du client : ");
                int ng=Clavier.lireInt()-1;
                if(ng<size){
                    listc.getListe().get(ng).impSolde();} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 10 :System.out.println("Entrer le numero du client : ");
                int ik=Clavier.lireInt()-1;
                if(ik<size){
                    System.out.println("Le compte numéro "+listc.getListe().get(ik).numero+" a effectué comme opération "+listc.getListe().get(ik).operation());} else System.out.println("Erreur numéro client");
                Thread.sleep( 5000 );
                break;
                
                case 11 : for(int i=0;i<size;i++){
                    listc.getListe().get(i).impSolde();}
                Thread.sleep( 5000 );
                break;
                
            }
        }
        
        PrintWriter fic=null;
        try{
            fic=new PrintWriter(new FileWriter("list"));
        } catch (Exception e){
            Erreur(e,1);
        }
// écriture dans le fichier
        try{
            fic.println(listc);
        } catch (Exception e){
            Erreur(e,3);
        }
// fermeture du fichier
        try{
            fic.close();
        } catch (Exception e){
            Erreur(e,2);
        }
        
    }
}