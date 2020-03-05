import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        char[] chars = new Scanner(System.in).nextLine().toCharArray();

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}