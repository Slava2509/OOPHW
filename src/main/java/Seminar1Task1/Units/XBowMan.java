package Seminar1Task1.Units;

public class XBowMan extends Shooter{
    public XBowMan() {
        super(100, 110, 15, 7, 5, "ogr", "Legalaz", 7, 10);
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

    }

    @Override
    public String getInfo() {
        return name +" здоровье: " + helth  + " макс. уровень здоровья: " + maxHelth +
                " скорость: "+ speed + " урон: " + damage + " защита: " + race + " раса: " + rangeAttack + " спец.атака "
                + amor + " боекомплект ";
    }

}
