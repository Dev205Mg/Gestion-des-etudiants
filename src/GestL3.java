
public class GestL3 extends Etudiant{
	private double sommeNotes = 0;
	private String parcour = "Gestion";
	
	public GestL3(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L3";
	}

	public double priseNotes(double gestionAdministrative, double droitPenal, double gestionDeProduction, double rapportDeStage) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Gestion administrative, Droit pénal, Gestion de production et Rapport de stage");
		sommeNotes = (gestionAdministrative + droitPenal + gestionDeProduction + rapportDeStage) / 4;
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
