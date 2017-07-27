import java.util.HashMap;
import java.util.HashSet;


public class SetRechteck {
	
	HashSet<Rechteck> rechtecke;
	HashMap<Integer,Rechteck> rechtmap;
	
	public SetRechteck(){
		rechtecke = new HashSet<Rechteck>();
	}
	
	public void rechteckhinzufuegen(Rechteck rechteck){
		boolean hinzugefuegt = rechtecke.add(rechteck);
		if(hinzugefuegt == true){
			System.out.println("Erfolgreich hinzugefügt");
		} else{
			System.out.println("Fehlgeschlagen");
		}
		System.out.println(rechtecke.size());
	}
}
