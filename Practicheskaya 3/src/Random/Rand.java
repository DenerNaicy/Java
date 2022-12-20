package Random;

import java.util.*;
public class Rand {
    public static void main(String[] args)
    {
        System.out.print("Введите колличество элементов массива:");
        Scanner n=new Scanner(System.in);
        Scanner m=new Scanner(System.in);
        int k=n.nextInt();
        int v=m.nextInt();
        Double[][] mas=new Double[k][v];
        System.out.println("Сгенерированный массив:");
        for (int i=0; i<k; i++)
        {
            for(int j=0; j<v;j++) {
                mas[i][j] = Math.random();

                System.out.println(mas[i][j]+"\t"+"\n");
            }
        }

    }
}
