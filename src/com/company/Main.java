package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int next = 0;
        Scanner scanner = new Scanner(System.in);

        int attempt = 0;
        int success = 0;
        while (next == 0) {
            ArrayList<String> bowl = new ArrayList<String>();
            bowl.add("blue");
            bowl.add("blue");
            bowl.add("blue");
            bowl.add("white");
            bowl.add("white");
            bowl.add("white");
            ArrayList<String> selectedMarbles = new ArrayList<String>();
            Random generator = new Random();
            int randomIndex = 6;
            for (int i = 0; i < 3; i++) {
                int selected = generator.nextInt(randomIndex);
                String selectedMarble = bowl.get(selected);
                bowl.remove(selected);
                selectedMarbles.add(selectedMarble);
                randomIndex --;
            }
            attempt ++;
            if (selectedMarbles.get(0).equalsIgnoreCase(selectedMarbles.get(1)) == true && selectedMarbles.get(1).equalsIgnoreCase(selectedMarbles.get(2)) == true) {
                success ++;
            }
            for (String m: selectedMarbles){
                System.out.println(m);
            }
            System.out.println("Do you want to try again (yes/no)" );
            String choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("no")){
                next = 1;
            }
        }
        double rate = Math.round((success / attempt) * 100);
        System.out.println("The success rate is: " + rate);
    }
}
