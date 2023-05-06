package Seminar1Task1.Units;

import java.util.ArrayList;

public class XBowMan extends Shooter{
    public XBowMan(ArrayList <Player> gang, int x, int y) {
        super(100, 110, 15, 7, 5, "ogr", "Legalaz", gang, x, y, 10);
        this.trick = 50;

    }

    protected int trick;

    public void longDistanceRace () {

    }

    public void fraud () {

    }

    @Override
    public String getInfo() {
        return "Лучник";
    }



    @Override
    public String toString() {
        return name +" helth: " + helth  + " speed: "+ speed + " урон: " + damage + " защита: "
                + rangeAttack + " спец.атака " + armor + " боекомплект ";
    }

}
