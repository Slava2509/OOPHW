package Seminar1Task1.Units;

import java.util.ArrayList;

public class XBowMan extends Shooter{
    public XBowMan(ArrayList <Player> gang) {
        super(100, 110, 15, 7, 5, "ogr", "Legalaz", gang);
        this.trick = 50;
    }

    protected int trick;

    public void longDistanceRace () {

    }

    public void fraud () {

    }

    @Override
    public String toString() {
        return "Лучник";
    }

    @Override
    public void step() {
        System.out.println(getClass().getName());

    }

    @Override
    public String getInfo() {
        return name +" здоровье: " + helth  + " макс. уровень здоровья: " + maxHelth +
                " скорость: "+ speed + " урон: " + damage + " защита: " + race + " раса: " + rangeAttack + " спец.атака "
                + amor + " боекомплект ";
    }

}
