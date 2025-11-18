package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class SleepPowder extends PhysicalMove{
	public SleepPowder() {
		super(Type.GRASS,0,75);
	}
	@Override
	public void applyOppEffects(Pokemon p) {
		Effect e = new Effect().turns(2);
		e.sleep(p);
	}

	@Override public String describe() {
		return "use Sleep Powder";
	}
}