import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase().toCharArray();
        int count = 0;
        for (char ch: input) {
            if (ch == 'g' || ch == 'c') {
                count++;
            }
        }
        double gcContent = 100.0 * count / input.length;
        System.out.println(gcContent);
    }
}