package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class DazzlingGleam extends SpecialMove{
	public DazzlingGleam() {
		super(Type.FAIRY,80,100);
	}
	@Override public String describe() {
		return "use Dazzling Gleam";
	}
}