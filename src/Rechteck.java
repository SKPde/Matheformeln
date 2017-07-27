
public class Rechteck {
	
	double laenge;
	double breite;
	private int idrechteck;
	private static int idzaehler;
	
	public Rechteck(double laenge, double breite){
		this.breite = breite;
		this.laenge = laenge;
		idrechteck = idzaehler;
		idzaehler++;
	}
	
	public int getID(){
		return this.idrechteck;
	}
	
}
