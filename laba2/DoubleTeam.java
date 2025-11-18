package move; 

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class DoubleTeam extends PhysicalMove {
	public DoubleTeam() {
		super(Type.NORMAL, 0, 0);
	}
	@Override
	public void applySelfEffects(Pokemon p) {
		p.setMod(Stat.EVASION,1);
		
	}

	@Override 
	public String describe() {
		return "use Double Team";
	}
	
	
}