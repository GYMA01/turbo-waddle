package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class SteelWing extends PhysicalMove{
	public SteelWing() {
		super(Type.STEEL,70,90);
	}
	
	@Override
	public void applySelfEffects(Pokemon p) {
		if (Math.random() < 0.1) {
			p.setMod(Stat.DEFENSE,1);
		}
		
	}
	
	@Override public String describe() {
		return "use SteelWing";
	}
}