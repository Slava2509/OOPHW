package Seminar1Task1.Units;

public class Mage extends Player {

    public Mage(int helth, int maxHelth, int speed, int damage, int def, String race, String name, int mana, int iq) {
        super(helth, maxHelth, speed, damage, def, race, name);
        this.mana = mana;
        this.iq = iq;
    }

    protected  int mana;
    protected int iq;

    public void fireBall() {

    }
    public void freez (){

    }
}
