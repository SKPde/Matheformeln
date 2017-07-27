import java.util.TreeSet;


public class TreeSetTest {
	
	TreeSet<Rechteck> testbaum;
	
	public TreeSetTest(){
		testbaum = new TreeSet<Rechteck>();
	}
	
	public void rechteckHinzufuegen(Rechteck rechteck){
		
		boolean hinzugefuegt = testbaum.add(rechteck);
		
		if(hinzugefuegt == true){
			System.out.println("Rechteck hinzugef�gt. Gr��e TreeSet: " + testbaum.size());
		} else {
			System.out.println("Objekt schon vorhanden!  Gr��e TreeSet: " + testbaum.size());
		}
	}

}
