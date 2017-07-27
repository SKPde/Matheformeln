import java.util.Scanner;


public class Hauptprogramm {

	public static void main(String[] args) {
		System.out.println("test");
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
		
		//System.out.print("Bitte Zahl eingeben: ");
		/*System.out.println(Zahlenverarbeitung.berechneKreis(in.nextInt()));
		System.out.println(Zahlenverarbeitung.loesePoly(7));
		System.out.println(Zahlenverarbeitung.flaecheDreieck(5, 3, 7));*/
		
		/*Hashtest settest = new Hashtest();
		
		SetRechteck setrechteck = new SetRechteck();*/
		
		Rechteck eck1 = new Rechteck(15,34);
		Rechteck eck2 = new Rechteck(15,34);
		/*setrechteck.rechteckhinzufuegen(eck1);
		setrechteck.rechteckhinzufuegen(eck2);
		setrechteck.rechteckhinzufuegen(eck1);
		setrechteck.rechteckhinzufuegen(eck1);
		
		System.out.println("LŠnge: " + eck1.laenge +" Breite: " + eck1.breite + " ID: " + eck1.getID());
		System.out.println("LŠnge: " + eck2.laenge +" Breite: " + eck2.breite + " ID: " + eck2.getID());*/
		
		/*while(true){
			System.out.print("Bitte Zahl eingeben: ");
			settest.zahlhinzufuegen(in.nextInt());
			System.out.println("Grš§e: " + settest.test.size());
		}*/
		
		Rechteck eck3 = new Rechteck(10,25);
		Rechteck eck4 = new Rechteck(18,7); 
		SetHashmap maptest = new SetHashmap();
		maptest.setRechtmap(eck1);
		maptest.setRechtmap(eck2);
		maptest.setRechtmap(eck3);
		maptest.setRechtmap(eck4);
		maptest.setRechtmap(eck2);
		
		maptest.durchlaufeRechtmap();
	
	}

}
