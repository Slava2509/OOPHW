package Seminar1Task1.Units;

import java.util.ArrayList;

public class Spearman extends Player {



    public Spearman(ArrayList<Player>gang, int x, int y) {
        super(100, 150, 8, 20, 50, "Human", "Diversant",gang, x , y);
        this.resistance = 25;
    }
    protected int resistance; // устойчивость к любым атакам


    @Override
    public String getInfo() {
        return "Копейщик";
    }

    @Override
    public void step(ArrayList<Player> team1) {

    }
    @Override
    public String toString() {
        return name + " здоровье " + helth + " скорость: " + speed + " урон: " + damage + " защита: " + def
               + " броня: " + resistance;
    }


}
