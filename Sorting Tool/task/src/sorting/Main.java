package sorting;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        long y = 0;
        int z = 0;
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            x++;
            if (number == y) {
                z++;
            } else if (number > y) {
                z = 1;
                y = number;
            }
        }
        System.out.println("Total numbers: " + x);
        System.out.println("The greatest number: " + y + "(" + z + " time(s)).");
    }
}
