package Seminar1Task1.Units;

import java.util.ArrayList;

public class Peasant extends Player {
    public boolean readiness;
    private Player Peasant;

    public Peasant(ArrayList<Player> gang, int x, int y) {
        super(100, 100, 1, 1, 0, "hobbit", "Kolka",gang, x, y);
        this.brave = 10;
        this.readiness = true;
    }

    protected int brave; // храбрость

    public void prick (){

    }// колоть(укол)
    @Override
    public String getInfo() {
        return "Крестьянин";
    }

    @Override
    public void step(ArrayList<Player> enemy) {
        if (readiness) {

        }else{
            readiness = true;

        }
    }


    @Override
    public String toString() {
        return name + " здоровье "+ helth + " скорость: "+ speed +
                " урон: " + damage + " защита: " +def + " раса " + race;
        }

    }

