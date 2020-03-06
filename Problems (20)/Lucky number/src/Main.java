import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < input.length() / 2; i++) {
            sum1 += input.charAt(i);
            sum2 += input.charAt(input.length() - 1 - i);
        }
        if (sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}