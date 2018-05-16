package com.kodilla.sudoku;

import java.util.Scanner;

public class SudokuValidator {
    public static String COORDINATE = "xy";
    public static String VALUE = "v";
    public static int validatorCoordinateOrValue(String xy, String task) {
        Scanner in = new Scanner(System.in);
        String number;
        while(true) {
            switch(task) {
                case "xy":
                    System.out.println(xy + " = ");
                    number = in.nextLine();
                    if (validNumber(number) && number.length() == 1 && Integer.parseInt(number) < 9) {
                        return Integer.parseInt(number);
                    } else {
                        System.out.println("Wrong number please choose for 0 to 8 !");
                    }
                    break;
                case "v":
                    System.out.println(xy + " = ");
                    number = in.nextLine();
                    if(validNumber(number) && number.length() == 1 && Integer.parseInt(number) < 10 && Integer.parseInt(number ) > 0) {
                        return Integer.parseInt(number);
                    } else {
                        System.out.println("Wrong number please choose for 1 to 9 !");
                    }
                    break;
            }
        }
    }

    private static boolean validNumber(String number) {
        boolean valid = true;
        for(int i = 0; i < number.length(); i++) {
            if(!(number.charAt(i) >= 48 && number.charAt(i) <= 57)){
                valid = false;
            }
        }
        return valid;
    }

    public static void newGame(String question) {
        Scanner in = new Scanner(System.in);
        boolean endGame = true;
        while (endGame) {
            System.out.println(question);
            String choose;
            choose = in.nextLine().toLowerCase();
            if (choose.equals("y")) {
                SudokuMenu.setGame(null);
                SudokuMenu.setGame(new SudokuGame());
                endGame = false;
            } else if (choose.equals("n")) {
                endGame = false;
            } else {
                System.out.println("Invalid characters, please use only Y or N!");
            }
        }
    }

    public static void exitGame(String question) {
        Scanner in = new Scanner(System.in);
        boolean endGame = true;
        while (endGame) {
            System.out.println(question);
            String choose;
            choose = in.nextLine().toLowerCase();
            if (choose.equals("y")) {
                System.exit(0);
                endGame = false;
            } else if (choose.equals("n")) {
                endGame = false;
            } else {
                System.out.println("Invalid characters, please use only Y or N!");
            }
        }
    }
}
