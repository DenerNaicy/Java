package Class;

import java.util.Scanner;

public class Class4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива: ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Введите элементы массива: ");
        int i = 0;
        do {
            a[i] = sc.nextInt();
            i = i + 1;
        }while( i < size);
        int sum=0;
        int j = 0;
        while(j < size){
            sum = sum + a[j];
            j = j + 1;
        }
        System.out.println("Сумма элементов массива: " + sum);
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for ( i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;

                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + a[a.length-1]);
        System.out.println("Минимальный элемент массива: " + a[0]);
    }
}