package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash(){
        super(Type.NORMAL, 70, 100);
    }
    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (att.getStat(Stat.SPEED) / 64.0 > Math.random()){
            System.out.println("Critical!");
            return 2.0;
        }
        else{
            return 1.0;
        }

    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "делает " + pieces[pieces.length-1];
    }
}
