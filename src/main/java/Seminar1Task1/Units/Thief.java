package Seminar1Task1.Units;

public class Thief extends Peasant {
    public Thief() {
        super();
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

    }

    @Override
    public String getInfo() {
        return name + " здоровье " + helth + " макс. уровень здоровья: " + maxHelth + " скорость: " + speed +
                " урон: " + damage + " защита: " + def + " раса " + race + " ловкость: " + agility + " скрытность " + secrecy;
    }
}
