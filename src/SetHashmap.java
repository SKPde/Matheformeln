import java.util.HashMap;
import java.util.Map;


public class SetHashmap {

	HashMap<Integer, Rechteck> rechtmap;
	
	public SetHashmap() {
		rechtmap = new HashMap<Integer, Rechteck>();
		
	}
	
	public void setRechtmap(Rechteck rechteck){
		if(rechtmap.containsValue(rechteck) == false){
			rechtmap.put(rechteck.getID(), rechteck);
			System.out.println("Rechteck hinzugef�gt Gr��e Hashmap: " + rechtmap.size());
		} else {
			System.out.println("Objekt schon vorhanden!");
		}

	}
	
	public void durchlaufeRechtmap(){
		
		for(Map.Entry<Integer, Rechteck> entry : rechtmap.entrySet()) {

			System.out.println("Schl�ssel: " + entry.getKey() + " Breite: " + entry.getValue().breite + " L�nge: " + entry.getValue().laenge);
			
		}
		
	}
}
