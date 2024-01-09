package moves;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam(){
        super(Type.PSYCHIC, 65, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.1) {
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length-1];
    }
}
