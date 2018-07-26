package CalculateNew;

public class Division {
    public float division(float a, float b) throws Exception {
        if (b==0){
            throw new Exception("На нуль делить нельзя!");
        }
        float c = a/b;
        System.out.printf("Результат операции деления введенных чисел равен: %.4f", c);
        return c;
    }
}
