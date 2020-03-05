import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        System.out.println(longest);
    }
}