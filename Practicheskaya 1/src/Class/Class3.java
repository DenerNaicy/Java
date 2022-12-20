package Class;
import java.util.Scanner;

public class Class3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.print("Введите размер массива: ");
        size = sc.nextInt();
        int[] a = new int[size];
        System.out.print("Введите элементы массива: ");
        for(int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<size;j++){
            sum = sum + a[j];
        }
        System.out.println("Сумма элементов массива: " + sum);
        int sred= sum / size;
        System.out.println("Средняя арифметическая: " + sred);

    }
}
