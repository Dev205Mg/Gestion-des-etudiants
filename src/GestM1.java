
public class GestM1 extends Etudiant {
	private double sommeNotes = 0;
	private String parcour = "Gestion";
	
	public GestM1(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "M1";
	}

	public double priseNotes(double economieInternationale, double bureautique, double strategieD_Entreprises) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Economie Internationale, Bureautique et strategie d'Entreprises");
		sommeNotes = (economieInternationale + bureautique + strategieD_Entreprises) / 3;
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
