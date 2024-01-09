package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DisarmingVoice extends SpecialMove {
    public DisarmingVoice(){
        super(Type.FAIRY, 40,100);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
