package pkmns;
import moves.Slash;
import ru.ifmo.se.pokemon.Type;

public class Gallade extends Kirlia{
    public Gallade(String name, int level){
        super(name, level);
        super.setType(Type.PSYCHIC, Type.FIGHTING);
        super.setStats(68, 125, 65, 65, 115, 80);
        Slash slash = new Slash();
        addMove(slash);
    }
}
