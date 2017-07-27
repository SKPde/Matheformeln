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
			System.out.println("Rechteck hinzugefügt Größe Hashmap: " + rechtmap.size());
		} else {
			System.out.println("Objekt schon vorhanden!");
		}

	}
	
	public void durchlaufeRechtmap(){
		
		for(Map.Entry<Integer, Rechteck> entry : rechtmap.entrySet()) {

			System.out.println("Schlüssel: " + entry.getKey() + " Breite: " + entry.getValue().breite + " Länge: " + entry.getValue().laenge);
			
		}
		
		System.out.println("--------------------------------------");
		
		for(int x = 0; x < rechtmap.size(); x++){
			System.out.println("Schlüssel: " + x + " Breite: " + rechtmap.get(x).breite + " Länge: " + rechtmap.get(x).laenge);
		}
	}
}
