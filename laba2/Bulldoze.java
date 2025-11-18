package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Bulldoze extends PhysicalMove{
	public Bulldoze() {
		super(Type.GROUND,60,100);
	}
	@Override
	public void applyOppEffects(Pokemon p) {
		p.setMod(Stat.SPEED,-1);
		
	}
	@Override public String describe() {
		return "use Bulldoze";
	}
}