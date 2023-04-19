package Seminar1Task1.Units;

public abstract class Shooter extends Player {
    public Shooter(int helth, int maxHelth, int speed, int damage, int def, String race, String name, int rangeAttack, int amor) {
        super(helth, maxHelth, speed, damage, def, race, name);
        this.rangeAttack = rangeAttack;
        this.amor = amor;
    }

    protected int rangeAttack;
    protected int amor;

    public void reload(){

    }
    public void accurateShot () {

    }



}
