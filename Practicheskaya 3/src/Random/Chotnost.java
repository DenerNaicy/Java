package Random;

import java.util.*;
public class Chotnost {
    public static void main (String[] args) {
        int t = 0;
        int n=0;
        System.out.print("Введите колличество элементов массива:");
        Scanner m = new Scanner(System.in);
        n = m.nextInt();
        Integer[] mas = new Integer[n];
        Integer[] b=new Integer[n];
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                mas[i] = (int) (Math.random() * n + 0);
                System.out.print(mas[i]+" ");
            }
            System.out.println("\n");
            for (int i = 0; i < n; i++) {
                if (mas[i] % 2 == 0) {

                    System.out.print(mas[i]+" ");
                }
            }

        }
        else{System.out.println("Неверное число, попробуйте еще раз");
        }
    }
}
