import java.util.HashSet;




public class Hashtest {
	HashSet<Integer> test;
	
	public Hashtest(){
		test = new HashSet<Integer>();
	}

	public void zahlhinzufuegen(int zahl){
		boolean zugefuegt = false;
		
		zugefuegt = test.add(zahl);
		
		if(zugefuegt == true){
			System.out.println(zahl + " wurde eingef�gt:)");
		} else{
			System.out.println("Hinzuf�gen fehlgeschagen!");
		}		
	}
}
