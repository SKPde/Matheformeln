import java.util.Scanner;
import java.util.TreeSet;


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
		Rechteck eck2 = new Rechteck(16,35);
		/*setrechteck.rechteckhinzufuegen(eck1);
		setrechteck.rechteckhinzufuegen(eck2);
		setrechteck.rechteckhinzufuegen(eck1);
		setrechteck.rechteckhinzufuegen(eck1);
		
		System.out.println("L�nge: " + eck1.laenge +" Breite: " + eck1.breite + " ID: " + eck1.getID());
		System.out.println("L�nge: " + eck2.laenge +" Breite: " + eck2.breite + " ID: " + eck2.getID());*/
		
		/*while(true){
			System.out.print("Bitte Zahl eingeben: ");
			settest.zahlhinzufuegen(in.nextInt());
			System.out.println("Gr��e: " + settest.test.size());
		}*/
		
		Rechteck eck3 = new Rechteck(10,25);
		Rechteck eck4 = new Rechteck(18,7); 
		
		/*SetHashmap maptest = new SetHashmap();
		maptest.setRechtmap(eck1);
		maptest.setRechtmap(eck2);
		maptest.setRechtmap(eck3);
		maptest.setRechtmap(eck4);
		maptest.setRechtmap(eck2);
		
		maptest.durchlaufeRechtmap();*/
		
		TreeSetTest treetest = new TreeSetTest();
		
		treetest.rechteckHinzufuegen(eck1);
		treetest.rechteckHinzufuegen(eck2);
		treetest.rechteckHinzufuegen(eck3);
		treetest.rechteckHinzufuegen(eck4);
		treetest.rechteckHinzufuegen(eck2);
		
		System.out.println(treetest.testbaum);
		
		Object[] eckarray = new Object[treetest.testbaum.size()];
		eckarray = treetest.testbaum.toArray();
		
		Rechteck eck5 =(Rechteck) eckarray[0];
		 
		System.out.println("Casteck, Breite: " + eck5.breite + " L�nge: " + eck5.laenge);
		
		System.out.println(treetest.testbaum.ceiling(eck3).breite);
	
	}

}
