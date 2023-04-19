package Seminar1Task1.Units;

public class Monk extends Mage {

    public Monk() {
        super(100, 200, 4, 5, 2, "Human", "MonahEgor", 50, 150);
        this.spirituality = 200;
    }

    protected int spirituality; // духовность

    public void heal() {

    }

    public void resurrect() {

    }// воскрешение

    @Override
    public String toString() {
        return "Монах";
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return name + " здоровье " + helth + " макс. уровень здоровья: " + maxHelth + " скорость: " + speed +
                " урон: " + damage + " защита: " + def + " раса " + race + " мана: " + mana + " ум: " + iq;
    }
}
