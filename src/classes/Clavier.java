

package classes;

import java.io.*;



public class Clavier{
    static int lireInt()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt( entree.readLine());
        return i;
    }
    static long lireLong()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        long i=Long.parseLong(entree.readLine());
        return i;
    }
    static float lireFloat()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        float i=Float.parseFloat(entree.readLine());
        return i;
    }
    static double lireDouble()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        double i=Double.parseDouble(entree.readLine());
        return i;
    }
    static String lireString()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        String i=entree.readLine();
        return i;
    }
    static char lireChar()throws IOException{
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));
        String i=entree.readLine();
        char j = i.charAt(0);
        return j;
    }
    
}