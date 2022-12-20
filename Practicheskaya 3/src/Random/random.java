package Random;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
        System.out.println("Сгенерировать массив целых чисел случайным образом ,вывести его на экран,отсортировать его,и снова вывести на экран.");
        System.out.print("Введите количество элементов массива: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Random m = new Random();
        Float mas[] = new Float[n];
        System.out.println("Случайный массив:");
        for (int i = 0; i < n; i++) {
            mas[i] = m.nextFloat();
            System.out.println(mas[i]);

        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < n; i++) {
            Arrays.sort(mas);
            System.out.println(mas[i]);
        }
    }
}

