import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        while (true) {
            Scanner scn = new Scanner(System.in);
            String input = scn.nextLine();
            if (input.trim().isEmpty()) {
                throw new RuntimeException("Пустые строки вводить нельзя!");
            } else {
                System.out.println(input);
            }
        }
    }
}
