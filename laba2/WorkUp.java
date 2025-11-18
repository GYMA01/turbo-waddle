package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class WorkUp extends StatusMove{
	public WorkUp() {
		super(Type.NORMAL,0,0);
	}
	
	@Override public void applySelfEffects(Pokemon p) {
		p.setMod(Stat.ATTACK,6);
	}

	@Override public String describe() {
		return "use Work Up";
	}
}