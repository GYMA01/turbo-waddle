package move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class StoneEdge extends PhysicalMove{
	public StoneEdge() {
		super(Type.ROCK,100,80);
	}
	@Override public String describe() {
		return "use Stone Edge";
	}
}