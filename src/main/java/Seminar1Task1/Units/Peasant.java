package Seminar1Task1.Units;

import java.util.ArrayList;

public class Peasant extends Player {
    public Peasant(ArrayList<Player> gang) {
        super(100, 100, 1, 1, 0, "hobbit", "Kolka",gang);
        this.brave = 10;
    }

    protected int brave; // храбрость

    public void prick (){

    }// колоть(укол)
    @Override
    public String toString() {
        return "Крестьянин";
    }
    @Override
    public void step() {
        System.out.println(getClass().getName());


    }

    @Override
    public String getInfo() {
        return name + " здоровье "+ helth +" макс. уровень здоровья: " + maxHelth +" скорость: "+ speed +
                " урон: " + damage + " защита: " +def + " раса " + race;
        }

    }

