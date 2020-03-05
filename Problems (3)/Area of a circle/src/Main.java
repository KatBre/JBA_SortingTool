import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double s = Math.PI * (radius * radius);
        System.out.println(s);
    }
}