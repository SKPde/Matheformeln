public class Zahlenverarbeitung {

	public static boolean primzahl(int zahl) {

		int count = 2;

		while (count <= (zahl / 2)) {
			if (zahl % count == 0) {
				return false;
			}
			count++;
		}

		return true;
	}

	public static int findePrimzahl(int n) {

		int count = 0;
		int zahl = 1;

		while (count < n) {
			if (Zahlenverarbeitung.primzahl(zahl) == true) {
				count++;
			}
			zahl++;
		}

		return (zahl - 1);
	}

	public static int[] findebisnPrimzahlen(int n) {

		int[] primzahlen = new int[n];

		int count = 0;
		int zahl = 1;
		int m = 0;

		while (count < n) {
			if (Zahlenverarbeitung.primzahl(zahl) == true) {
				count++;
				primzahlen[m] = zahl;
				m++;
			}
			zahl++;
		}

		return primzahlen;
	}

	public static int[] fibo(int n) {
		int[] fiboreihe = new int[n + 1];
		int temp = 2;
		fiboreihe[0] = 0;
		if (n == 0) {
			return fiboreihe;
		}
		fiboreihe[1] = 1;
		if (n == 1) {
			return fiboreihe;
		}
		while (temp <= n) {
			fiboreihe[temp] = fiboreihe[temp - 2] + fiboreihe[temp - 1];
			temp++;
		}

		return fiboreihe;
	}

	public static long fakultaet(int n) {
		long ergebnis = 1;
		if (n < 1 || n > 20) {
			return 0;
		}

		while (n > 0) {
			ergebnis *= n;
			n--;
		}

		return ergebnis;
	}

	public static double berechneKreis(double r) {

		return Math.pow(r, 2) * Math.PI;
	}

	public static double loesePoly(double x) {
		return Math.pow(x, 3) * 3 + 5 * Math.pow(x, 2) - 6 * x + 2;
	}
	
	public static double flaecheDreieck(double a, double b, double c){
		
		double s = (a+b+c)/2;
		return s*(s-a)*(s-b)*(s-c);
	}
	public static double flaecheQuadrat(double kantenlaenge){
		return Math.pow(kantenlaenge, 2);
	}
}
