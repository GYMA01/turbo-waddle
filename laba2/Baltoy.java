package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Baltoy extends Pokemon {
	public Baltoy(String name, int level) {
		super(name, level);
		setType(Type.GROUND,Type.PSYCHIC);
		setStats(40,40,55,40,70,55);
		setMove(new Extrasensory(),new IceBeam(),new Bulldoze());
		
	}
	

}