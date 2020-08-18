package interface_graphique;

public class Grade {
	 private  String   id_grade;
	 private String libelle_grade;
	 private String date_obtention;
     private String id_agent	;
	public Grade(String id_grade, String libelle_grade, String date_obtention, String id_agent) {
		super();
		this.id_grade = id_grade;
		this.libelle_grade = libelle_grade;
		this.date_obtention = date_obtention;
		this.id_agent = id_agent;
	}
	public String getId_grade() {
		return id_grade;
	}
	public void setId_grade(String id_grade) {
		this.id_grade = id_grade;
	}
	public String getLibelle_grade() {
		return libelle_grade;
	}
	public void setLibelle_grade(String libelle_grade) {
		this.libelle_grade = libelle_grade;
	}
	public String getDate_obtention() {
		return date_obtention;
	}
	public void setDate_obtention(String date_obtention) {
		this.date_obtention = date_obtention;
	}
	public String getId_agent() {
		return id_agent;
	}
	public void setId_agent(String id_agent) {
		this.id_agent = id_agent;
	}
     
}
