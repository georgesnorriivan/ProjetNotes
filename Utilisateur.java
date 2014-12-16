
public abstract class Utilisateur {
	

	private String id;
	private String prenom;
	private String nom;
	private String mdp;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	public Utilisateur(){
		this.id="defaut";
		this.prenom="defaut";
		this.nom="defaut";
		this.mdp="defaut";
		
	}
	
	public Utilisateur(String id, String prenom, String nom, String mdp) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.mdp = mdp;
		}

	public String toString() {
		return "Utilisateur [id=" + id + ", prenom=" + prenom + ", nom=" + nom
				+ ", mdp=" + mdp + "]";
	}
	
	public void consulterNotes();
	

}
