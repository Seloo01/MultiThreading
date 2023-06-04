package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Kaçdan başlasın?");
        int startTime = scn.nextInt();
        System.out.println("Kaçda bitsin?");
        int finishTime = scn.nextInt();
        System.out.println("Kaç saniyede artsın?");
        long increasTime = scn.nextLong();

        MultiThreadingExample thread = new MultiThreadingExample(startTime,finishTime,increasTime);
        thread.run();
    }
}
