package move;

import ru.ifmo.se.pokemon.*;

import pokemon.*;

public class KillPokemon extends StatusMove{
    public KillPokemon() {
        super(Type.NORMAL,0,100);
    } 
    public void applyOppEffects(Pokemon p) {
        p.setMod(Stat.HP,(int)p.getHP()+1);
    }
    @Override public String describe(){
        return "use KillPokemon";
    }
} 
