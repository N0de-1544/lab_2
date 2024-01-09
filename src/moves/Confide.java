package moves;

import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect sa_dw = new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(sa_dw);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
}
