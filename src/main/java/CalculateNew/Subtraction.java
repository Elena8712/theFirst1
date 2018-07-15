package CalculateNew;

import static CalculateNew.calculate.scanner;

public class Subtraction {

    public void subtraction() {
        System.out.println("Введите уменьшаемое:");
        float a = scanner.nextFloat();
        System.out.println("Введите вычитаемое:");
        float b = scanner.nextFloat();
        float c = a-b;
        System.out.printf("Результат операции вычитания введенных чисел равен: %.4f", c);

    }
}
