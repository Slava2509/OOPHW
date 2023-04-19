package Seminar1Task1.Units;

public class Spearman extends Player {



    public Spearman() {
        super(100, 150, 3, 20, 50, "Human", "Diversant");
        this.resistance = 25;
    }
    protected int resistance; // устойчивость к любым атакам

    public void groupAttaks() {
    }

    public void earthquake() {
    }

    @Override
    public String toString() {
        return "Копейщик";
    }

    @Override
    public void step() {
    }
    @Override
    public String getInfo() {
        return name + " здоровье " + helth + " макс. уровень здоровья: " + maxHelth + " скорость: " + speed +
                " урон: " + damage + " защита: " + def + " раса " + race + " устойчивость к любым атакам: " + resistance;
    }


}
