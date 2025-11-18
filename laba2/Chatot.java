package pokemon;

import ru.ifmo.se.pokemon.*; 
import move.*;

public class Chatot extends Pokemon{
	public Chatot(String name, int level) {
		super(name,level);
		setType(Type.PSYCHIC);
		setStats(0,65,45,92,42,91);
		setMove(new DoubleTeam(),new AerialAce(),new SteelWing(),new WorkUp());
		
	}
	
} 