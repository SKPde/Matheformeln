import java.util.Scanner;


public class Hauptprogramm {

	public static void main(String[] args) {

		/*System.out.println(Zahlenverarbeitung.primzahl(777999));
		System.out.println(Zahlenverarbeitung.findePrimzahl(8));
		
		int[] primarray = Zahlenverarbeitung.findebisnPrimzahlen(10);
		
		for(int x = 0; x < primarray.length; x++){
			System.out.println(primarray[x]);
		}
		int[] fiboarray = Zahlenverarbeitung.fibo(27);
		
		for(int x = 0; x < fiboarray.length; x++){
			System.out.println(fiboarray[x]);
		}*/
		//System.out.println(Zahlenverarbeitung.fakultaet(29));
		
		Scanner in = new Scanner(System.in);
		System.out.print("Bitte Zahl eingeben: ");
		System.out.println(Zahlenverarbeitung.berechneKreis(in.nextInt()));
		System.out.println(Zahlenverarbeitung.loesePoly(7));
		System.out.println(Zahlenverarbeitung.flaecheDreieck(5, 3, 7));
	}

}
