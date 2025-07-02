public class bubbleSortTask {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        System.out.println("До сортировки:");
        printArray(numbers);
        bubbleSort(numbers);
        System.out.println("После сортировки:");
        printArray(numbers);
    }

    public static void bubbleSort(int[] intArray) {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - i - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
