package Seminar1Task1.Units;

import java.util.ArrayList;

//Крестьянин	Разбойник	Снайпер	Колдун
//        копейщик	арбалетчик	монах
public abstract class Player implements GameInterface {

    protected int helth;
    protected int maxHelth;
    public int speed;// это вместо инициативы
    protected int damage;
    protected int def;
    protected String race;
    protected String name;
    protected ArrayList <Player> gang;



    public Player(int helth, int maxHelth, int speed, int damage, int def, String race, String name, ArrayList<Player>gang) {
        this.helth = helth;
        this.maxHelth = maxHelth;
        this.speed = speed;
        this.damage = damage;
        this.def = def;
        this.race = race;
        this.name = name;
        this.gang = gang;
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

    protected void getDamage (float damage){
        helth -= damage;
        if (helth<0) {
            helth = 0;
        }
        if (helth>maxHelth) {helth = maxHelth;
        }

    }


}




