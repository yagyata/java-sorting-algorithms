import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean isSwapped;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
    }

    public static void main(String[] args) {
        int[] marks = {90, 92, 85, 86, 82, 87};
        System.out.println("Student marks sorted in ascending order: ");
        bubbleSort(marks);
        System.out.println(Arrays.toString(marks));
    }
}
