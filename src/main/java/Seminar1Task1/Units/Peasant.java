package Seminar1Task1.Units;

public class Peasant extends Player {
    public Peasant(int helth, int maxHelth, int speed, int damage, int def, String race, String name, int brave) {
        super(helth, maxHelth, speed, damage, def, race, name);
        this.brave = brave;
    }

    protected int brave; // храбрость

    public void prick (){

    }// колоть(укол)

}
