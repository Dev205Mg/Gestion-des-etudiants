
public  class InfoL1 extends Etudiant {
	private double sommeNotes = 0;
	private String parcour = "Informatique";
	
	public InfoL1(String nom, String numMatricul) {
		super(nom, numMatricul);
		this.niveau = "L1";
	}
	
	public double priseNotes(double algo, double pao, double css, double html ) {
		System.out.println(this.niveau + " en "+ this.parcour +" vos matiers sont : Algorithme, Pao et HTML/CSS");
		sommeNotes = (algo + pao + css + html) / 4;
		return sommeNotes;
	}

	@Override
	public void calcMoy() {
		this.decision(sommeNotes);
		System.out.println(" Nom : " + this.nom + "\n Matricule : " + this.numMatricul+ "\n Domaine : " + this.parcour + "\n Niveau : " + this.niveau + "\n Moyenne : "+ this.sommeNotes);
		System.out.println(" Decision : "+ this.decision);
		System.out.println("<<------------------------------------------------------->>");
	}
	
}
