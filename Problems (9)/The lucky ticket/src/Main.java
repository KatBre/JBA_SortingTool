import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticket = scanner.next();
        if (ticket.charAt(0) + ticket.charAt(1) + ticket.charAt(2) == ticket.charAt(3) + ticket.charAt(4) + ticket.charAt(5)) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
