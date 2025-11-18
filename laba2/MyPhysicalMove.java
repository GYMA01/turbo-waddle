package move;

import ru.ifmo.se.pokemon.*;

import pokemon.*;

public class MyPhysicalMove extends PhysicalMove{
    public MyPhysicalMove() {
        super(Type.NORMAL,20,100);
    }

    protected void applyOppEffects(Pokemon def) {
        Effect eff = new Effect().condition(Status.FREEZE);
        def.addEffect(eff);
    }

    @Override 
    public String describe() {
		return "use MyPhysicalMove";
	}
}
