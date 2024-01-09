package pkmns;

import moves.NightSlash;
import ru.ifmo.se.pokemon.Type;

public class Honchkrow extends Murkrow{
    public Honchkrow(String name, int level){
        super(name, level);
        super.setType(Type.DARK, Type.FLYING);
        super.setStats(100, 125, 52, 105, 52, 71);
        NightSlash nightSlash = new NightSlash();
        addMove(nightSlash);
    }
}
