package Seminar1Task1;

import Seminar1Task1.Units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;


public class main {
    public static void main(String[] args) {
//        Monk monk = new Monk();
//        System.out.println(monk);
//        Thief thief = new Thief();
//        System.out.println(thief);
//        Sniper sniper = new Sniper();
//        System.out.println(sniper);
//        Spearman spearman = new Spearman();
//        System.out.println(spearman.getInfo());
//        XBowMan xBowMan = new XBowMan();
//        System.out.println(xBowMan.getInfo());
        ArrayList<Player> team1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team1.add(new Sniper());
                    break;
                case 1:
                    team1.add(new Peasant());
                    break;
                case 2:
                    team1.add(new Monk());
                    break;
                case 3:
                    team1.add(new Thief());
                    break;
                case 4:
                    team1.add(new Spearman());
                    break;
                case 5:
                    team1.add(new XBowMan());
                    break;
            }
        }
        ArrayList<Player> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Sniper());
                    break;
                case 1:
                    team2.add(new Peasant());
                    break;
                case 2:
                    team2.add(new Monk());
                    break;
                case 3:
                    team2.add(new Thief());
                    break;
                case 4:
                    team2.add(new Spearman());
                    break;
                case 5:
                    team2.add(new XBowMan());
                    break;
            }


        }
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println();
        team2.forEach(n -> System.out.println(n.getInfo()));
    }
}