package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataType = "word";
        String longestWord = "";
        String longestLine = "";
        long maxLong = 0;
        long count = 0;
        long maxCount = 0;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-dataType")) {
                dataType = args[i + 1];
            }
        }

        switch (dataType) {
            case "long":
                while (scanner.hasNextLong()) {
                    long number = scanner.nextLong();
                    count++;
                    if (number > maxLong) {
                        maxLong = number;
                        maxCount = 1;
                    } else if (number == maxLong) {
                        maxCount++;
                    }
                }
                System.out.println("Total numbers: " + count);
                System.out.println("The greatest number: " + maxLong + " (" + maxCount + " time(s), " + maxCount * 100 / count + "%).");
                break;
            case "word":
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    count++;
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                        maxCount = 1;
                    } else if (word.length() == longestWord.length()) {
                        maxCount++;
                    }
                }
                System.out.println("Total words: " + count);
                System.out.println("The longest word: " + longestWord + " (" + maxCount + " time(s), " + maxCount * 100 / count + "%).");
                break;
            case "line":
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    count++;
                    if (line.length() > longestLine.length()) {
                        longestLine = line;
                        maxCount = 1;
                    } else if (line.length() == longestLine.length()) {
                        maxCount++;
                    }
                }
                System.out.println("Total lines: " + count);
                System.out.println("The longest line: "); ;
                System.out.println(longestLine);
                System.out.println("(" + maxCount + " time(s), " + maxCount * 100 / count + "%).");
                break;
        }
    }
}
