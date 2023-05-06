package Seminar1Task1.Units;

import java.util.ArrayList;

public abstract class Shooter extends Player {


    protected int rangeAttack;
    protected int armor;
    private ArrayList<Player> Peasant;


    public Shooter(int helth, int maxHelth, int speed, int damage, int def, String race, String name, ArrayList<Player> gang, int x,
                   int y, int armor) {
        super(helth, maxHelth, speed, damage, def, race, name, gang, x, y);
        this.armor = armor;
    }

    public void recharge() {

    }

    public void accurateShot() {

    }

    @Override
    public void step(ArrayList<Player> team1) {
        if (helth <= 0 || armor <= 0) {
            return;
        }
        ;
        float minDistance = Float.MAX_VALUE;
        Player target = null;
        for (Player u : team1) {
            float tmp = u.coordinate.getDistance(this.coordinate);
            if (tmp < minDistance) {
                minDistance = tmp;
                target = u;
                this.armor -= 1;
            }
            for (Player player : gang) {
                if (player instanceof Peasant) {
                    if (!player.die() && ((Peasant) player).readiness) {
                        ((Peasant) player).readiness = false;
                        System.exit(0);
                        this.armor += 1;
                        return;
                    }
                }
            }

        }
        System.out.println(name + " Cтреляет в " + target.name);
    }

}

