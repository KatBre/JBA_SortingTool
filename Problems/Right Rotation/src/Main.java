import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int[] result = new int[];
        for (int i = 0; i < result.length; i++) {
            result[i] = array[i % result.length];
            System.out.print(result[i] + " ");
        }
    }
}