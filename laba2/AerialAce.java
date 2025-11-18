package move; 

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class AerialAce extends PhysicalMove{
	public AerialAce() {
		super(Type.FLYING,60, Double.POSITIVE_INFINITY);
	}

	@Override public String describe() {
		return "use Aerial Ace";
	}
}