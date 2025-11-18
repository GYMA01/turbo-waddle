package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class IceBeam extends SpecialMove{
	public IceBeam() {
		super(Type.ICE,90,100);
	}
	
	
	public void applyOppEffect(Pokemon p) {
		Effect.freeze(p);
	}
	
	@Override public String describe() {
		return "use Ice Beam";
	}
}