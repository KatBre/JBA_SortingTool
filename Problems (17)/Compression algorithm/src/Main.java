import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 1;
        int start = 0;
        int sum = 0;
        if (input.length() == 1) {
            System.out.print(input);
            System.out.print(count);
        } else {
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(start) == input.charAt(i)) {
                    count++;
                } else if (input.charAt(start) != input.charAt(i)) {
                    System.out.print(input.charAt(start));
                    System.out.print(count);
                    sum += count;
                    start = i;
                    count = 1;
                }
                if (sum + count == input.length()) {
                    System.out.print(input.charAt(start));
                    System.out.print(count);
                }
            }
        }
    }
}