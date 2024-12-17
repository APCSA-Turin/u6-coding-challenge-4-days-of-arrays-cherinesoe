package com.example.project;
import java.util.Random;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        String[][] list = new String[2][names.length];
        Random rand = new Random();

        for (int i = 0; i < names.length; i++) {
            if(rand.nextBoolean()) {
                list[0][i] = names[i];
            } else {
                list[1][i] = names[i];
            }
        }
        return list; //you must return a two dimensional string array
    }

    public static void main(String[] args) {
        // String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        // String[][] result = Day2.nameSort(names);

        // for (int i = 0; i < result[0].length; i++) {
        //     System.out.println(result[0][i]);
        // }
        // for (int i = 0; i < result[1].length; i++) {
        //     System.out.println(result[1][i]);
        // }
    }
}