package Seminar1Task1.Units;

import java.util.ArrayList;

public class Thief extends Peasant {
    public Thief(ArrayList <Player> gang, int x, int y) {
        super(gang, x, y);
        this.speed = 2;
        this.agility = 20;
        this.secrecy = 3;
        this.name = "Julik";
    }

    protected int agility; // ловкость
    protected int secrecy; // скрытность

    public void backstab (){

    } // удар в спину
    public void hide (){

    }// спрятаться

    @Override
    public String getInfo() {
        return "Вор";
    }

    @Override
    public void step(ArrayList<Player> team1) {
        System.out.println(getClass().getName());

    }

    @Override
    public String toString() {
        return name + " здоровье " + helth + " speed: " + speed + " урон: " + damage + " защита: " + def + " ловкость: "
                + agility + " скрытность " + secrecy;
    }
}
