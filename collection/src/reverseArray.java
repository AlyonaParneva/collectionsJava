import java.util.ArrayList;

public class reverseArray {
    public static void reverse(ArrayList<Integer> intList) {
        int n = intList.size() - 1;
        for (int i = 0; i < intList.size() / 2; i++) {
            int temp = intList.get(i);
            intList.set(i, intList.get(n - i));
            intList.set(n - i, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            numbers.add(i);
        }
        System.out.println("Изначальный: " + numbers);
        reverse(numbers);
        System.out.println("Обратный: " + numbers);
    }
}
