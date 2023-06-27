import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) throws Exception {
        int a = 90;
        int b = 3;
        System.out.println(a / b);
        printSum(23, 234);
        int[] abc = {1, 2, 213, 546};
        abc[3] = 9;
        System.out.println(Arrays.toString(abc));
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
