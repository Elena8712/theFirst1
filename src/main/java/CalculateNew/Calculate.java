package CalculateNew;

import java.util.Scanner;

public class Calculate {
    private float a;
    private float b;
    private String tipe1;


    public Calculate(float a, float b, String tipe1) throws Exception {
        this.a = a;
        this.b = b;
        this.tipe1 = tipe1;
    }

    Division div = new Division();
    Multiplication mult = new Multiplication();
    Subtraction sub = new Subtraction();
    Sum sm = new Sum();

    public void calc() throws Exception {
        switch (tipe1) {
            case ("деление"):
                div.division(a, b);
                break;

            case ("умножение"):
                mult.multiplication(a, b);

                break;

            case ("вычитание"):
                sub.subtraction(a, b);

                break;

            case ("сложение"):
                sm.sum(a, b);

                break;
        }
    }
}



