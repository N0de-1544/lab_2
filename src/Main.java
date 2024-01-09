import pkmns.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pkmns.HoopaConfined;

public class Main {
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Pokemon t1_1 = new HoopaConfined("Клоун", 40);
        Pokemon t1_2 = new Kirlia("Дюймовочка", 40);
        Pokemon t1_3 = new Honchkrow("Ворон-ученый", 40);
        Pokemon t2_1 = new Gallade("Боксер", 40);
        Pokemon t2_2 = new HoopaConfined("Фитнес-тренер", 40);
        Pokemon t3_3 = new Murkrow("Ворон в шляпе", 40);
        b.addAlly(t1_1);
        b.addAlly(t1_2);
        b.addAlly(t1_3);
        b.addFoe(t2_1);
        b.addFoe(t2_2);
        b.addFoe(t3_3);
        b.go();
    }
}