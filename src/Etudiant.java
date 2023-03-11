
public abstract class Etudiant {
	public String nom, numMatricul, niveau, decision;

	public Etudiant(String nom, String numMatricul) {
		this.nom = nom;
		this.numMatricul = numMatricul;
	}
	
	public abstract void calcMoy();
	
	public void decision(double somNotes) {
		if (somNotes <= 11) {
			decision = "Repêchage";
		} else {
			decision = "Admis";
		}
	}
	
}
