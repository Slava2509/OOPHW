package Seminar1Task1.Units;

import java.util.ArrayList;

public class Thief extends Peasant {
    public Thief(ArrayList <Player> gang) {
        super(gang);
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
    public String toString() {
        return "Вор";
    }

    @Override
    public void step() {
        System.out.println(getClass().getName());

    }

    @Override
    public String getInfo() {
        return name + " здоровье " + helth + " макс. уровень здоровья: " + maxHelth + " скорость: " + speed +
                " урон: " + damage + " защита: " + def + " раса " + race + " ловкость: " + agility + " скрытность " + secrecy;
    }
}
