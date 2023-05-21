package Seminar1Task1.Units;

import Seminar1Task1.Coordinate;
import javafx.scene.control.skin.CellSkinBase;

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
    protected ArrayList<Player> gang;
    protected Coordinate coordinate;


    public Player(int helth, int maxHelth, int speed, int damage, int def, String race, String name,
                  ArrayList<Player> gang, int x, int y) {
        this.helth = helth;
        this.maxHelth = maxHelth;
        this.speed = speed;
        this.damage = damage;
        this.def = def;
        this.race = race;
        this.name = name;
        this.gang = gang;
        this.coordinate = new Coordinate(x, y);

    }

    protected void move(Player target) {
        float dx = target.coordinate.distanceXY(this.coordinate)[0];
        float dy = target.coordinate.distanceXY(this.coordinate)[1];
        if (Math.abs(dy) < Math.abs(dx)) {
            if (dx > 0) {
                if (isEmptyPosition(this.coordinate.x-1, this.coordinate.y))
                    this.coordinate.x--;
            } else {
                if (isEmptyPosition(this.coordinate.x+1, this.coordinate.y))
                    this.coordinate.x++;
            }
            if (dy > 0) {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y-1))
                    this.coordinate.y--;
            } else {
                if (isEmptyPosition(this.coordinate.x, this.coordinate.y+1))
                    this.coordinate.y++;
            }
        }
    }

    protected boolean isEmptyPosition(int x, int y) {
        for (Player player : gang) {
            if ((player.coordinate.x == x) && (player.coordinate.y == y)) {
                if (!player.die()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void attack() {

        System.out.println("атака");
    }

    public boolean die() {
        if (helth <= 0) {
            return true;
        } else {
            return false;
        }

    }

    public void defend() {
        System.out.println("общая защита");
    }

    protected void getDamage(float damage) {
        helth -= damage;
        if (helth < 0) {
            helth = 0;
        }
        if (helth > maxHelth) {
            helth = maxHelth;
        }

    }

    public int[] getCoords() {
        return new int[]{coordinate.x, coordinate.y};
    }

    public int getHp() {
        return helth;
    }
@Override
    public void step(ArrayList<Player>enemy){

}
}





