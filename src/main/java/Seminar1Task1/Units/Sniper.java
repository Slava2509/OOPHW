package Seminar1Task1.Units;

public class Sniper extends Shooter {
    public Sniper() {
        super(100, 150, 6, 40, 3, "elf", "Legalaz", 30, 10);
        this.criticalDamage = criticalDamage;
    }

    protected float criticalDamage;

    public void stealth (){

    };

    @Override
    public String toString() {
        return name;
    }
}
