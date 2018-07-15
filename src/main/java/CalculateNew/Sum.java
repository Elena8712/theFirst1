package CalculateNew;

import static CalculateNew.calculate.scanner;

public class Sum {

    public void sum() {
        System.out.println("Введите первое слагаемое:");
        float a = scanner.nextFloat();
        System.out.println("Введите второе слагаемое:");
        float b = scanner.nextFloat();
        float c = a+b;
        System.out.printf("Сумма введенных чисел равна: %.4f", c);

    }

}
