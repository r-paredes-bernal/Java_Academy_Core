package academy.core.session5.generics.diamond.wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildCarHierarchy {
	public static void main(String[] args) {

		ArrayList<Son> sons = new ArrayList<Son>();
		ArrayList<Father> fathers = new ArrayList<Father>();
		ArrayList<GrandPa> grandPas = new ArrayList<GrandPa>();
		
		WildCarHierarchy.add(sons);
		WildCarHierarchy.add(fathers);
		WildCarHierarchy.add(grandPas);
		
		WildCarHierarchy.add1(sons);
		WildCarHierarchy.add1(fathers);
		WildCarHierarchy.add1(grandPas);
	}
	
	// All below
	public static void add(List<? extends Father> arg) {
		
	}

	// All Above
	public static void add1(List<? super Father> arg) {
		
	}
}
