package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Swagger extends StatusMove{
	public Swagger() {
		super(Type.NORMAL,0,85);
	}

	void applyOppEffect(Pokemon p) {
		p.confuse();
		p.setMod(Stat.ATTACK,2);
	}
	@Override public String describe() {
		return "use Swagger";
	}
}