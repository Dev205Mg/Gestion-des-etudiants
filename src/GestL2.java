
public class GestL2 extends Etudiant{
	private double sommeNotes = 0;
	private String parcour = "Gestion";
	
	public GestL2(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L2";
	}

	public double priseNotes(double techniquesBancaires, double analyseFinanciere, double droitDesAffaires, double macroEconomie) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Techniques Bancaires, Analyse financière, Droit des affaires et Macro-économie");
		sommeNotes = (techniquesBancaires + analyseFinanciere + droitDesAffaires + macroEconomie) / 4;
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
