package Seminar1Task1;

import Seminar1Task1.Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;


public class main {
    public static ArrayList<Player> team1 = new ArrayList<>();
    public static ArrayList<Player> team2 = new ArrayList<>();
    public static ArrayList<Player> team3 = new ArrayList<>();

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
        init();
        Scanner input = new Scanner(System.in);
        while (true) {
            team3 = sortTeam();
            View.view();
            input.nextLine();
            for (Player player : team3) {
                if (team1.contains(player)) {
                    player.step(team2);
                } else {
                    player.step(team1);
                }
            }
        }
    }

    private static void init() {
        team3.addAll(team1);
        team3.addAll(team2);
        team3.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return o2.speed - o1.speed;
            }
        });
        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team1.add(new Sniper(team1, 1, i));
                    break;
                case 1:
                    team1.add(new Peasant(team1, 1, i));
                    break;
                case 2:
                    team1.add(new Monk(team1, 1, i));
                    break;
                case 3:
                    team1.add(new Thief(team1, 1, i));
                    break;
                case 4:
                    team1.add(new Spearman(team1, 1, i));
                    break;
                case 5:
                    team1.add(new XBowMan(team1, 1, i));
                    break;
            }
        }

        for (int i = 1; i < 11; i++) {
            switch (new Random().nextInt(6)) {
                case 0:
                    team2.add(new Sniper(team2, 10, i));
                    break;
                case 1:
                    team2.add(new Peasant(team2, 10, i));
                    break;
                case 2:
                    team2.add(new Monk(team2, 10, i));
                    break;
                case 3:
                    team2.add(new Thief(team2, 10, i));
                    break;
                case 4:
                    team2.add(new Spearman(team2, 10, i));
                    break;
                case 5:
                    team2.add(new XBowMan(team2, 10, i));
                    break;
            }
        }

    }

    private static ArrayList<Player> sortTeam() {
        ArrayList<Player> list = new ArrayList<>();
        list.addAll(team1);
        list.addAll(team2);
        list.sort(new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if (o2.speed == o1.speed)
                    return (int) (o2.getHp() - o1.getHp());
                else return (int) (o2.speed - o1.speed);
            }
        });
        return list;
    }
}