package CalculateNew;

import java.util.Scanner;

public class calculate {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        Division div = new Division();
        Multiplication mult = new Multiplication();
        Subtraction sub = new Subtraction();
        Sum sm = new Sum();
        System.out.println("Введите тип операции:сложение, вычитание, умножение деление");
        String tipeoperation = scanner.next();
        String tipe1 = tipeoperation;

        switch (tipe1) {
            case ("деление"):
                div.division();

                break;

            case ("умножение"):
                mult.multiplication();

                break;

            case ("вычитание"):
                sub.subtraction();

                break;

            case ("сложение"):
                sm.sum();

                break;
        }



        }


    }

