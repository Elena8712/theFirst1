package CalculateNew;

import static CalculateNew.calculate.scanner;

public class Division {
    public void division() {
        System.out.println("Введите первое делимое:");
        float a = scanner.nextFloat();
        System.out.println("Введите второе делитель:");
        float b = scanner.nextFloat();
        float c = a/b;
        System.out.printf("Результат операции деления введенных чисел равен: %.4f", c);

    }
}
