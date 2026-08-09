package Array;
public class Dup {
    public static void main(String[] args) {

        int[] arr = {9, 8, 7, 5, 8, 4, 9, 7};
        int size = arr.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {

                if (arr[i] == arr[j]) {

                    // Shift elements to the left
                    for (int k = j; k < size - 1; k++) {
                        arr[k] = arr[k + 1];
                    }

                    size--;

                    // Stay at the same index because a new element
                    // has shifted into position j
                    j--;
                }
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
