import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int hours = scanner.nextInt();
        double result = distance / hours;
        System.out.println(result);
    }
}