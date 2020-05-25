import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] incomes = new double[n];
        for (int i = 0; i < incomes.length; i++) {
            incomes[i] = scanner.nextInt();
        }
        double[] tax = new double[n];
        for (int i = 0; i < tax.length; i++) {
            tax[i] = scanner.nextInt();
        }
        double max = 0;
        int result = 0;
        double temp;
        for (int i = 0; i < incomes.length; i++) {
            temp = incomes[i] * tax[i] / 100;
            if (temp > max) {
                max = temp;
                result = i + 1;
            }
        }
        System.out.println(result);
    }
}