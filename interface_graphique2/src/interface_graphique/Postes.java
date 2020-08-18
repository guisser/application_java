package interface_graphique;

public class Postes {
	 private  String   id_poste;
	 private String libelle_poste;
	 private String grade;
	 private String date_occupation;
	 private String departement;
     private Agent id_agent	;
	public Postes(String id_poste, Agent id_agent, String libelle_poste,String grade, String departement,String date_occupation) 
	{
		super();
		this.id_poste = id_poste;
		this.libelle_poste = libelle_poste;
		this.date_occupation = date_occupation;
		this.departement = departement;
		this.id_agent = id_agent;
		
	}
	public String getId_poste() {
		return id_poste;
	}
	public void setId_poste(String id_poste) {
		this.id_poste = id_poste;
	}
	public String getLibelle_poste() {
		return libelle_poste;
	}
	public void setLibelle_poste(String libelle_poste) {
		this.libelle_poste = libelle_poste;
	}
	public String getDate_occupation() {
		return date_occupation;
	}
	public void setDate_occupation(String date_occupation) {
		this.date_occupation = date_occupation;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public Agent getId_agent() {
		return id_agent;
	}
	public void setId_agent(Agent id_agent) {
		this.id_agent = id_agent;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

 
}
