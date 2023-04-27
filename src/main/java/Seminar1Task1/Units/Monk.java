package Seminar1Task1.Units;

import java.util.ArrayList;

public class Monk extends Mage {

    public Monk(ArrayList<Player> gang, int x, int y) {
        super(100, 200, 4, -10, 2, "Human", "MonahEgor", gang, x, y);
        this.spirituality = 20;
        this.mana = 50;
        this.iq = 100;
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
    public void step(ArrayList<Player> team1) {
        for (Player player : gang) {
            if (player.helth < player.maxHelth) {
                player.getDamage(damage);
            }
            return;
        }
    }



    @Override
    public String getInfo() {
        return name + " здоровье " + helth + " макс. уровень здоровья: " + maxHelth + " скорость: " + speed +
                " урон: " + damage + " защита: " + def + " раса " + race + " мана: " + mana + " ум: " + iq;
    }
}
