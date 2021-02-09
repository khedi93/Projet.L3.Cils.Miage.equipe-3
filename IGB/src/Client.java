
public class Client extends Personne {
  private int id;
	public Client(String nom, String prenom, String adresse, String dateB, String téléphone, String mail, char sexe, int id) {
		super(nom, prenom, adresse, dateB, téléphone, mail, sexe);
		this.id=id;
		
	}
	
	
	public String Modifier(int i) {
		String res="";
		if(i==1) {
			
		}
		
		
		
		return res;
	
	}
	
	public String Infos() {
		return("Identifiant:"+id+"\nNom:"+getNom()+"\nPrenom:"+getPrenom()+"\nAdresse:"
	    +getAdresse()+"\nDate de naissance:"+getDateB()+"\nTéléphone:"+getTéléphone()+"\nE-mail:"+getMail());
	}

}
