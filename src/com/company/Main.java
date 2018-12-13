package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int N = 24;
        solution(N);
    }

    public static void solution(int N) {
        // write your code in Java SE 8
        for (int i = 1; i <= N; i++) {
            //Checks for case 2 and 3 or just 2 or just 3 or just 5
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Codility" + "Test");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Test" + "Coders");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Codility" + "Coders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 5 == 0) {
                System.out.println("Coders");
            }

            //Checks if all three numbers are evenly divisible
            else if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Codility" + "Test" + "Coders");
            }
            //Checks if none of the numbers are evenly divisible
            else if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                System.out.println(i);
            }

        }
    }

}
