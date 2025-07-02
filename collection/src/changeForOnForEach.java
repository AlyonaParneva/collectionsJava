import java.util.ArrayList;

public class changeForOnForEach {
    public static void printList(ArrayList<Integer> list) {
        list.forEach(element -> System.out.println(element));
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Список:");
        printList(numbers);
    }
}
