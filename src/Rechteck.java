
public class Rechteck implements Comparable {
	
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

	@Override
	public int compareTo(Object compareObject) {
		 // RŸckgabewert
        int compareValue =-2;
        // Typumwandlung zur Klasse Punkt
        Rechteck compareRechteck = (Rechteck)compareObject;
        // Vergleich auf Gleichheit
        if((this.breite*this.laenge) == (compareRechteck.breite*compareRechteck.laenge))
        {
            compareValue = 0;
        }
        // Vergleich auf kleiner
        if((this.breite*this.laenge) < (compareRechteck.breite*compareRechteck.laenge))
        {
            compareValue = -1;
        }
        // Vergleich auf grš§er
        if((this.breite*this.laenge) > (compareRechteck.breite*compareRechteck.laenge))
        {
            compareValue = 1;
        }
		return 0;
	}
	
}
