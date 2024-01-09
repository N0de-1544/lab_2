package pkmns;

import moves.DisarmingVoice;
import ru.ifmo.se.pokemon.Type;
public class Kirlia extends Ralts{
    public Kirlia(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC, Type.FAIRY);
        super.setStats(38, 35, 35, 65, 55, 50);
        DisarmingVoice disarmingVoice = new DisarmingVoice();
        addMove(disarmingVoice);
    }
}
