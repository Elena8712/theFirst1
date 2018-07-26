package CalculateNew;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("Введите тип операции:сложение, вычитание, умножение, деление");
        String tipeoperation = scanner.next();
        String tipe1 = tipeoperation;
        System.out.println("Введите первое число:");
        float a = scanner.nextFloat();
        System.out.println("Введите второе число:");
        float b = scanner.nextFloat();
        Calculate calculate = new Calculate(a, b, tipe1);
        calculate.calc();
    }
}
