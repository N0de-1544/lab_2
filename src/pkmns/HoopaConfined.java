package pkmns;

import moves.Astonish;
import moves.DoubleTeam;
import moves.Psybeam;
import moves.Psychic;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class HoopaConfined extends Pokemon {
    public HoopaConfined(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC, Type.GHOST);
        super.setStats(80, 110, 60, 150, 130, 70);
        Psybeam psybeam = new Psybeam();
        Astonish astonish= new Astonish();
        DoubleTeam doubleTeam = new DoubleTeam();
        Psychic psychic = new Psychic();
        super.setMove(psybeam, astonish, doubleTeam, psychic);
    }
}
