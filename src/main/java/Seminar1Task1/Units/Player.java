package Seminar1Task1.Units;
//Крестьянин	Разбойник	Снайпер	Колдун
//        копейщик	арбалетчик	монах
public abstract class Player implements GameInterface {

    protected int helth;
    protected int maxHelth;
    protected int speed;
    protected int damage;
    protected int def;
    protected String race;
    protected String name;



    public Player(int helth, int maxHelth, int speed, int damage, int def, String race, String name) {
        this.helth = helth;
        this.maxHelth = maxHelth;
        this.speed = speed;
        this.damage = damage;
        this.def = def;
        this.race = race;
        this.name = name;
    }

    public void moove() {

        System.out.println("движение");
    }

    public void attack () {

        System.out.println("атака");
    }

    public void died (){
        System.out.println("погиб");
    }

    public void defend () {
        System.out.println("общая защита");
    }


}




