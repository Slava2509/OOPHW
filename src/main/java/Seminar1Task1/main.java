package Seminar1Task1;

import Seminar1Task1.Units.*;

import java.util.ArrayList;
import java.util.Comparator;
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
                    team1.add(new Sniper(team1));
                    break;
                case 1:
                    team1.add(new Peasant(team1));
                    break;
                case 2:
                    team1.add(new Monk(team1));
                    break;
                case 3:
                    team1.add(new Thief(team1));
                    break;
                case 4:
                    team1.add(new Spearman(team1));
                    break;
                case 5:
                    team1.add(new XBowMan(team1));
                    break;
            }
        }
        ArrayList<Player> team2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Sniper(team2));
                    break;
                case 1:
                    team2.add(new Peasant(team2));
                    break;
                case 2:
                    team2.add(new Monk(team2));
                    break;
                case 3:
                    team2.add(new Thief(team2));
                    break;
                case 4:
                    team2.add(new Spearman(team2));
                    break;
                case 5:
                    team2.add(new XBowMan(team2));
                    break;
            }


        }
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-".repeat(5));
        team2.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-".repeat(5));
        team1.forEach(n -> n.step());
        team2.forEach(n -> n.step());
        team1.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("-".repeat(5));
        team2.forEach(n -> System.out.println(n.getInfo()));


        ArrayList<Player> team3 = new ArrayList<>();
        team3.addAll(team1);
        team3.addAll(team2);
        System.out.println(team3);
        team3.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.speed - o1.speed;
            }
        });
        System.out.println(team3);
    }
}