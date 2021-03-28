package ru.geekbrains.practicalWork3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * Project practical_work
 *
 * @Author Svetlana Totmyanina
 * Create 10.03.2021
 */
public class TicTacToe {
    private static final char DOT_HUMAN='X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();



    private static char[][] field;
    public static int fieldSizeX;
    public static int fieldSizeY;

    public static void main(String[] args) {
       while (true) {
            initField();
            printField();
            while (true) {
                humanTurn();
                printField();
                if (gameCheck(DOT_HUMAN, "Human wins!!!!!")) break;
                aiTurn();
                printField();
                if (gameCheck(DOT_AI, "AI wins!!!!!")) break;
            }
            System.out.println("Wanna play again? >> Y or N");
            if(SCANNER.next().toLowerCase().equals("Y")) break;
        }


    }

    private  static boolean gameCheck(char dot, String s){
        if(checkWin(dot)){
            System.out.println(s);
            return  true;
        }
        if (checkDraw()){
            System.out.println("DRAW!!!!");
            return  true;
        }
        return false;
    }

    private static boolean checkDraw(){
        for (int y = 0; y < fieldSizeX; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(isCellEmpty(x,y)) return false;
            }
        }
        return  true;
    }

    private static boolean checkWin(char c){
       for (int y=0; y<3; y++){
           for (int x=0; x<3; x++){
               if(checkDiagonal(c) || checkLanes(c)) return true;
           }
       }
    return false;
}

    public static boolean checkDiagonal(char symb) {
        boolean toRight = true;
        boolean toLeft = true;
        for (int i=0; i<4; i++) {
            toRight &= (field[i][i] == symb);
            toLeft &= (field[4-i-1][i] == symb);
        }
        if (toRight || toLeft) return true;
        return false;
    }

    public static boolean checkLanes(char symb) {
        boolean cols, rows;
        for (int col = 0; col < 4; col++) {
            cols = true;
            rows = true;
            for (int row = 0; row < 4; row++) {
                cols &= (field[col][row] == symb);
                rows &= (field[row][col] == symb);
            }

            if (cols || rows) return true;
        }
        return false;
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (!isCellEmpty(x,y));
        field[y][x]=DOT_AI;
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты x и y через пробел >>>>>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
       } while (!isCellValid(x,y) || !isCellEmpty(x,y));
         field[y][x]=DOT_HUMAN;
    }

    private static boolean isCellValid(int x, int y){
        return x>=0 && y>=0 && x<fieldSizeX && y<fieldSizeY;
    }

    public static boolean isCellEmpty(int x, int y){
        return field[y][x] == DOT_EMPTY;
    }

    private static void initField(){
        fieldSizeX=5;
        fieldSizeY=5;
        field=new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeX; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    public static void printField() {
        System.out.print("+");
        for (int x = 0; x <= fieldSizeX*2+1; x++)
            System.out.print((x%2==0)?"-":x/2+1);
        System.out.println();

        for (int y = 0; y < fieldSizeX; y++) {
            System.out.print((y + 1) + "|");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + "|");
            }
            System.out.println();
        }

        for (int x = 0; x <= fieldSizeX*2+1; x++)
            System.out.print("-");
        System.out.println();
    }
}
