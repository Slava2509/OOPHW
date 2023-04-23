package Seminar1Task1.Units;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Player> gang) {
        super(100, 150, 10, 40, 3, "elf", "ContrTerrorist", gang);
        this.criticalDamage = criticalDamage;
    }

    protected float criticalDamage;

    public void stealth (){

    };

    @Override
    public String toString() {
        return "Снайпер";
    }

    @Override
    public void step() {
        System.out.println(getClass().getName());
    }
    @Override
    public String getInfo() {
        return name +" здоровье: " + helth  + " макс. уровень здоровья: " + maxHelth +
                " скорость: "+ speed + " урон: " + damage;
    }

}
