
public class GestL1 extends Etudiant {
	private double sommeNotes = 0;
	private String parcour = "Gestion";
	
	public GestL1(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L1";
	}

	public double priseNotes(double comptabiliteGenerale, double economieGenerale, double marketing, double mathFi ) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Comptabilité générale, Économie générale, Marketing et Mathématiques financières ");
		sommeNotes = (comptabiliteGenerale + economieGenerale + marketing + mathFi) / 4;
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
