package Seminar1Task1.Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Player> gang, int x, int y) {
        super(100, 150, 10, 40, 3, "elf", "ContrTerrorist", gang, x, y,10);
        this.criticalDamage = criticalDamage;
    }

    protected float criticalDamage;

    public void stealth (){

    };

    @Override
    public String getInfo() {
        return "Снайпер";
    }


    @Override
    public String toString() {
        return name +" здоровье: " + helth  + " скорость: "+ speed + " урон: " + damage  + " боекомплект "  + armor;
    }

}
