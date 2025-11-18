package pokemon;

import ru.ifmo.se.pokemon.*;
import move.*;

public class MyPokemon extends Pokemon {
    
    public MyPokemon(String name, int level) {
        super(name,level);
        setType(Type.FIRE);
        setStats(100,20,10,10,10,15);
       
    }
}
