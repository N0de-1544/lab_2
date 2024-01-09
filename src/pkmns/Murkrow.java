package pkmns;

import moves.Confide;
import moves.Psychic;
import moves.ThunderWave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Murkrow extends Pokemon{
    public Murkrow(String name, int level){
        super(name, level);
        super.setType(Type.DARK, Type.FLYING);
        super.setStats(60, 85, 42, 85, 42, 91);
        ThunderWave thunderWave = new ThunderWave();
        Psychic psychic = new Psychic();
        Confide confide = new Confide();
        setMove(thunderWave, psychic, confide);
    }
}
