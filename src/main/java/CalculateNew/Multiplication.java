package CalculateNew;

import static CalculateNew.calculate.scanner;

public class Multiplication {

    public void multiplication() {
        System.out.println("Введите первый множитель:");
        float a = scanner.nextFloat();
        System.out.println("Введите второй множитель:");
        float b = scanner.nextFloat();
        float c = a*b;
        System.out.printf("Результат умножения введенных чисел равен: %.4f", c);

    }
}
