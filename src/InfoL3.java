
public class InfoL3 extends Etudiant{
	private double sommeNotes = 0;
	private String parcour = "Informatique";
	
	public InfoL3(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L3";
	}
	
	public double priseNotes(double angular, double symfony, double nodeJs, double xamarin, double administrationSystème, double rapportDeStage) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Angular, Symfony, NodeJs, Xamarin, Administration système et Rapport de stage");
		sommeNotes = (angular + symfony + nodeJs + xamarin + administrationSystème + rapportDeStage) / 6;
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
