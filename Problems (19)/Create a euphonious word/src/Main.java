import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String vowels = "aeiouy";
        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            boolean vowel = false;
            boolean consonant = false;
            for (int j = 0; j < 3; j++) {
                char letter = input.charAt(i + j);
                int index = vowels.indexOf(letter);
                if (index < 0) {
                    consonant = true;
                } else {
                    vowel = true;
                }
            }
            if (consonant && !vowel || vowel && !consonant) {
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}