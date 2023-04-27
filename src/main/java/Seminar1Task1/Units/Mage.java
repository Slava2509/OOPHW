package Seminar1Task1.Units;

import java.util.ArrayList;

public abstract class Mage extends Player {


    protected int mana;
    protected int iq;

    public Mage(int helth, int maxHelth, int speed, int damage, int def, String race, String name, ArrayList<Player> gang, int x, int y) {
        super(helth, maxHelth, speed, damage, def, race, name, gang, x,y);
        this.mana = mana;
        this.iq = iq;
    }

    public void fireBall() {

    }


    public void freez() {

    }


}