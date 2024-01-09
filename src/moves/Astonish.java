package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Astonish extends PhysicalMove {
    public Astonish(){
        super(Type.GHOST, 30, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.3) {
            Effect.flinch(p);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
