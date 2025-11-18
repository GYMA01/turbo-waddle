package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Venoshock extends SpecialMove{
	public Venoshock() {
		super(Type.POISON,65,100);
	}
	@Override protected void applyOppDamage(Pokemon def, double damage) {
		if (def.getCondition() == Status.POISON) {
			def.setMod(Stat.HP, -((int)(2*damage)));
		}
	}
	@Override public String describe() {
		return "use Venoshock";
	}
}