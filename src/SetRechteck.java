import java.util.HashSet;


public class SetRechteck {
	
	private HashSet<Rechteck> rechtecke;
	
	public SetRechteck(){
		rechtecke = new HashSet<Rechteck>();
	}
	
	public void rechteckhinzufuegen(Rechteck rechteck){
		boolean hinzugefuegt = rechtecke.add(rechteck);
		if(hinzugefuegt == true){
			System.out.println("Erfolgreich hinzugef�gt");
		} else{
			System.out.println("Fehlgeschlagen");
		}
		System.out.println(rechtecke.size());
	}
}
