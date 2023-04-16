package Seminar1Task1.Units;

public class Thief extends Peasant {
    public Thief() {
        super(100, 105, 5, 1, 2, "Ork", "Vasiliy", 50);
        this.agility = 20;
        this.secrecy = 3;
    }

    protected int agility; // ловкость
    protected int secrecy; // скрытность

    public void backstab (){

    } // удар в спину
    public void hide (){

    }// спрятаться

    @Override
    public String toString() {
        return name;
    }
}
