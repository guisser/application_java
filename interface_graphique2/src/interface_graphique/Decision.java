package interface_graphique;

public class Decision {

	private Decision id_decision;
	private Postes id_poste;
	private Agent ig_agent;
	public Decision getId_decision() {
		return id_decision;
	}
	public void setId_decision(Decision id_decision) {
		this.id_decision = id_decision;
	}
	public Postes getId_poste() {
		return id_poste;
	}
	public void setId_poste(Postes id_poste) {
		this.id_poste = id_poste;
	}
	public Agent getIg_agent() {
		return ig_agent;
	}
	public void setIg_agent(Agent ig_agent) {
		this.ig_agent = ig_agent;
	}
	public String getVisa() {
		return visa;
	}
	public void setVisa(String visa) {
		this.visa = visa;
	}
	public Decision(Decision id_decision, Postes id_poste, Agent ig_agent, String visa) {
		super();
		this.id_decision = id_decision;
		this.id_poste = id_poste;
		this.ig_agent = ig_agent;
		this.visa = visa;
	}
	private String visa;
	

}
