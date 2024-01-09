package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        super.applySelfEffects(p);
        Effect ev_up = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(ev_up);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }
}
