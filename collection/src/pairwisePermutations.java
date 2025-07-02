import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pairwisePermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите чётное число N: ");
        int N = scanner.nextInt();

        if (N % 2 != 0 || N <= 0) {
            System.out.println("N должно быть положительным чётным числом.");
            return;
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            numbers.add(i);
        }

        System.out.println("До перестановки: " + numbers);

        for (int i = 0; i < numbers.size(); i += 2) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(i + 1));
            numbers.set(i + 1, temp);
        }

        System.out.println("После перестановки: " + numbers);
    }
}
