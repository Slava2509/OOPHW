package Seminar1Task1.Units;

public class Spearman extends Peasant {
    public Spearman() {
        super(100, 160, 2, 30, 10, "goblin", "Rafik", 100);
        this. resistance = 25;


    }
    protected int resistance; // устойчивость к лбым атакам

    public void groupAttaks (){

    }

    public void earthquake () {

    }

    @Override
    public String toString() {
        return name;
    }
}
