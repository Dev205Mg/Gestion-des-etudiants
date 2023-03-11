
public class InfoL2 extends Etudiant{
	private double sommeNotes = 0;
	private String parcour = "Informatique";
	
	public InfoL2(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L2";
	}
	
	public double priseNotes(double js, double java, double php, double reseau) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Javascript, java, Php et Réseau");
		sommeNotes = (js + java + php + reseau) / 4;
		return sommeNotes;
	}

	@Override
	public void calcMoy() {
		this.decision(sommeNotes);
		System.out.println(" Nom : " + this.nom + "\n Matricule : " + this.numMatricul+ "\n Domaine : " + this.parcour + "\n Niveau : " + this.niveau + "\n Moyenne : "+ this.sommeNotes);
		System.out.println(" Decision : "+ this.decision);
		System.out.println("<<--------------------------------------------------------->>");
	}

}
