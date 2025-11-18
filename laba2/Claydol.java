package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class Claydol extends Pokemon {
	public Claydol(String name, int level) {
		super(name, level);
		setType(Type.GROUND,Type.PSYCHIC);
		setStats(60,70,105,70,120,75);
		setMove(new Extrasensory(),new IceBeam(),new Bulldoze(),new StoneEdge());
		
	}

}