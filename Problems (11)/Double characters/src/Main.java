import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] word = scanner.nextLine().toCharArray();

        for (char letter : word) {
            System.out.print(letter);
            System.out.print(letter);
        }
    }
}