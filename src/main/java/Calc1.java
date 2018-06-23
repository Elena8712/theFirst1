import java.util.Scanner;

public class Calc1 {
     public static final void main(String[] args){
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter float1");
         float float1 = scanner.nextFloat();

         System.out.println("Enter float2");
         float float2 = scanner.nextFloat();

         float sum = float1 + float2;
         System.out.printf("Sum float1 and float2: %.4f", sum);

         scanner.close();
     }
}


