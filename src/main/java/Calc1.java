import java.util.Scanner;

public class Calc1 {
    public static final void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1 - калькулятор");
        System.out.println("2 - поиск максимального слова");
        int t = scanner.nextInt();

        if (t == 1) {

            System.out.println("Введите тип операции:сложение, вычитание, умножение деление");
            String tipeoperation = scanner.next();
            String tipe1 = tipeoperation;

            switch (tipe1) {
                case "вычитание":
                    System.out.println("Введите уменьшаемое");
                    float float1 = scanner.nextFloat();

                    System.out.println("Введите вычитаемое");
                    float float2 = scanner.nextFloat();

                    float sum = float1 - float2;
                    System.out.printf("Sum float1 and float2: %.4f", sum);

                    break;

                case "умножение":
                    System.out.println("Введите 1ый множитель");
                    float float5 = scanner.nextFloat();

                    System.out.println("Введите 2ой множитель");
                    float float6 = scanner.nextFloat();

                    float sum2 = float5 * float6;
                    System.out.printf("Multiplication float5 and float6: %.4f", sum2);

                    break;

                case "деление":
                    System.out.println("Введите делимое");
                    float float7 = scanner.nextFloat();

                    System.out.println("Введите делитель");
                    float float8 = scanner.nextFloat();

                    float sum3 = float7 / float8;
                    System.out.printf("Sum float7 and float8: %.4f", sum3);

                    break;

                case "сложение":
                    System.out.println("Enter float1");
                    float float3 = scanner.nextFloat();

                    System.out.println("Enter float2");
                    float float4 = scanner.nextFloat();

                    float sum1 = float3 + float4;
                    System.out.printf("Sum float1 and float2: %.4f", sum1);

                    break;

            }
        }
        else {

            System.out.println("Какое количество слов будет введено?");
            int n = scanner.nextInt();

            String[] words = new String[n];
            String maxLength = " ";

            int s = 0;

            while (s < n) {

                System.out.println("Введите слово " + (s + 1));
                words[s] = scanner.next();
                s++;
            }
            for (int j = 0; j < n; j++) {
                if (words[j].length() > maxLength.length())
                    maxLength = words[j];

            }
            System.out.println("Самое длинное слово:" + maxLength);
        }





            scanner.close();
        }


    }











