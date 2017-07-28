
public class Rechteck implements Comparable<Object> {
	
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
        //int compareValue =-2;
        // Typumwandlung zur Klasse Punkt
        Rechteck compareRechteck = (Rechteck)compareObject;
        // Vergleich auf Gleichheit
        if(this.laenge == compareRechteck.laenge)
        {
            return 0;
        }
        // Vergleich auf kleiner
        //if(this.breite < compareRechteck.breite)
        //{
            //compareValue = -1;
        //}
        // Vergleich auf grš§er
        /*if(breite > compareRechteck.breite)
        {
            compareValue = 1;
        }*/
        
		//return (int)(100*Math.random());
        //return this.idrechteck;
        return (int) this.laenge;
	}
	
}
