package Seminar1Task1.Units;

public class XBowMan extends Shooter{
    public XBowMan() {
        super(100, 110, 15, 7, 5, "ogr", "Julik", 7, 10);
        this.trick = 50;
    }

    protected int trick;

    public void longDistanceRace () {

    }

    public void fraud () {

    }

    @Override
    public String toString() {
        return name;
    }
}
