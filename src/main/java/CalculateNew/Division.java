package CalculateNew;

import static CalculateNew.calculate.scanner;

public class Division {
    public void division() throws Exception {
        System.out.println("Введите делимое:");
        float a = scanner.nextFloat();
        System.out.println("Введите делитель:");
        float b = scanner.nextFloat();
        if (b==0){
            throw new Exception("На нуль делить нельзя!");
        }
        float c = a/b;
        System.out.printf("Результат операции деления введенных чисел равен: %.4f", c);

    }
}
