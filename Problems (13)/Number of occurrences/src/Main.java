import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String contains = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < word.length() - contains.length() + 1; i++) {
            if (word.charAt(i) == contains.charAt(0)) {
                if (contains.equals(word.substring(i, i + contains.length()))) {
                    count++;
                    i += contains.length();
                }
            }
        }
        System.out.println(count);
    }
}