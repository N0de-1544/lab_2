package moves;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {
    public Psychic(){
        super(Type.PSYCHIC, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        if (Math.random() < 0.1) {
            Effect sd_dw = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(sd_dw);
        }
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
