package interface_graphique;

public class Agent {
 private  int   CIN;	
 private String Nom;
 private String Prenom;
 private String Adresse;
 private String Numero;
 private String Email;
 
    public Agent(int cIN, String nom, String prenom, String adresse, String numero, String email) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
		Adresse = adresse;
		Numero = numero;
		Email= email;
        }
public int getCIN() {
	return CIN;
}
public void setCIN(int cIN) {
	CIN = cIN;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getAdresse() {
	return Adresse;
}
public void setAdresse(String adresse) {
	Adresse = adresse;
}
public String getNumero() {
	return Numero;
}
public void setNumero(String numero) {
	Numero = numero;
}
public String getSecteur_activite() {
	return Email;
}
public void setSecteur_activite(String email) {
	this.Email = email;
}
}

