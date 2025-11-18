package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Extrasensory extends SpecialMove{
	public Extrasensory() {
		super(Type.PSYCHIC,80,100);
	}

	@Override
	public void applyOppEffects(Pokemon p) {
		if (Math.random() < 0.1) {
			Effect.flinch(p);
		}
	}
	
	@Override public String describe() {
		return "use Extrasensory";
	}
}