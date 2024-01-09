package pkmns;

import moves.Confide;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Ralts extends Pokemon {
    public Ralts(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC, Type.FAIRY);
        super.setStats(28, 25, 25, 45, 35, 40);
        Confide confide = new Confide();
        setMove(confide);
    }
}
