
public class GestM2 extends Etudiant {
	private double sommeNotes = 0;
	private String parcour = "Gestion";

	public GestM2(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "M2";
	}
	
	public double priseNotes(double managementDeLaTechnologie, double managementInternational, double mémoire) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Management De La Technologie, Management International et Mémoire d'etude");
		sommeNotes = (managementDeLaTechnologie + managementInternational + mémoire) / 3;
		return sommeNotes;
	}

	@Override
	public void calcMoy() {
		this.decision(sommeNotes);
		System.out.println(" Nom : " + this.nom + "\n Matricule : " + this.numMatricul+ "\n Domaine : " + this.parcour + "\n Niveau : " + this.niveau + "\n Moyenne : "+ this.sommeNotes);
		System.out.println(" Decision : "+ this.decision);
		System.out.println("<<---------------------------------------------------------->>");
	}
	
	
}
