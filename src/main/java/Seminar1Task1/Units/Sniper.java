package Seminar1Task1.Units;

public class Sniper extends Shooter {
    public Sniper() {
        super(100, 150, 6, 40, 3, "elf", "ContrTerrorist", 30, 10);
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

    }
    @Override
    public String getInfo() {
        return name +" здоровье: " + helth  + " макс. уровень здоровья: " + maxHelth +
                " скорость: "+ speed + " урон: " + damage;
    }

}
