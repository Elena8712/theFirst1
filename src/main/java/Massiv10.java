import java.util.Scanner;

public class Massiv10 {

    public static void main(String[] args) {

        int [] array = new int[20];

        int i = 0;
        int maxnum = 0-11;
        int minnum = 0+11;
        int indMaxNum = 0;
        int indMinNum = 0;
        int var;

        for (i=0; i<=19; i++){
            array[i] = (int)(Math.random()*21-10.5);

            System.out.println(array[i]);
        }

        for (int m=0; m<=19; m++){
            if ((array[m] > maxnum)&&(array[m] < 0)) {
                maxnum = array[m];
                indMaxNum = m;
            }

            for  (int s=0; s<=19; s++)   {
                if ((array[s] < minnum)&&(array[s] > 0)){
                    minnum = array[s];
                    indMinNum = s;
                }


        }


        }
        System.out.println("Максимальное отрицательное число:" + maxnum);
        System.out.println("Минимальное положительное число:" + minnum);
        var = array[indMaxNum];
        array[indMaxNum] = array[indMinNum];
        array[indMinNum] = var;


    }
}
