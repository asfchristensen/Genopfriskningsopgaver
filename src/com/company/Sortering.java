package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sortering {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast 5 ord: ");
        String word = "";

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            words.add(sc.nextLine());
        }
        Collections.sort(words);
        Collections.reverse(words);
        System.out.println(words);

    }


}
