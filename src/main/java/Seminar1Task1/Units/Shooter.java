package Seminar1Task1.Units;

import java.util.ArrayList;

public abstract class Shooter extends Player {


    protected int rangeAttack;
    protected int amor;

    public Shooter(int helth, int maxHelth, int speed, int damage, int def, String race, String name, ArrayList<Player> gang) {
        super(helth, maxHelth, speed, damage, def, race, name, gang);
    }

    public void reload(){

    }
    public void accurateShot () {

    }



}
