package Class;
import java.util.Scanner;

public class Class7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        number = sc.nextInt();
        if (number == 0) {
            System.out.println("Факториал равен: 1");
        } else {
            if (number < 0) {
                System.out.println("Ошибка");
            } else {
                int fac = 1;
                for (int i = 1; i <= number; i++) {
                    fac = fac * i;
                }
                System.out.println("Факториал равен: " + fac);
            }
        }
    }
}
