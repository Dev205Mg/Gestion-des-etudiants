
public class Main {

	public static void main(String[] args) {
		InfoL1 dssi = new InfoL1("Panathole", "3405");
		dssi.priseNotes(12, 9.5, 15.3, 8.75);
		dssi.calcMoy();
		
		InfoL2 dss22 = new InfoL2("Samuel", "3504");
		dss22.priseNotes(11, 17.5, 15, 19.75);
		dss22.calcMoy();
		
		InfoL3 dss23 = new InfoL3("Florice", "3303");
		dss23.priseNotes(7.5, 13.5, 8, 15, 4, 3);
		dss23.calcMoy();
		
		GestL1 l154 = new GestL1("Rakoto", "2304");
		l154.priseNotes(5, 12, 7, 16.5);
		l154.calcMoy();
		
		GestL2 l254 = new GestL2("Bota", "2704");
		l254.priseNotes(11, 10.5, 13, 8.5);
		l254.calcMoy();
		
		GestL3 l354 = new GestL3("Tefihaja", "2204");
		l354.priseNotes(10, 11.5, 6, 16.5);
		l354.calcMoy();
		
		GestM1 m153 = new GestM1("Felana", "3258");
		m153.priseNotes(12.1, 10, 17.5);
		m153.calcMoy();
		
		GestM2 m152 = new GestM2("Onja", "3259");
		m152.priseNotes(12.5, 13, 17.5);
		m152.calcMoy();
	}

}
