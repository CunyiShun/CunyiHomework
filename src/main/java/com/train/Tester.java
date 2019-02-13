package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Please enter number of tickets:");
        Scanner scanner= new Scanner(System.in);
        int totaltickets=scanner.nextInt();
        System.out.println("How many roundtrip tickets:");
        int roundtrip = scanner.nextInt();
        Tick tic= new Tick(totaltickets,roundtrip);
        tic.print();
    }
}
