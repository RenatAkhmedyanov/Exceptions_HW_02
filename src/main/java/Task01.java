import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        System.out.println("Введенное число = " + getFloat());
    }

    public static float getFloat() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите дробное число:");
        while (true) {
            try {
                float input = scn.nextFloat();
                return input;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод! Необходимо ввести дробное число!");
                scn.nextLine();
            }
        }
    }
}
