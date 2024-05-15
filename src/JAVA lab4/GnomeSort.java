public class GnomeSort {
    public static void gnomeSort(int[] arr) {
        int index = 0;
        while (index < arr.length) {
            if (index == 0) {
                index++;
            }
            if (arr[index] >= arr[index - 1]) {
                index++;
            } else {
                int temp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = temp;
                index--;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        System.out.println("Before sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        gnomeSort(array);
        System.out.println("\nAfter sorting:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}