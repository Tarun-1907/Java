import java.util.Arrays;

public class jp9 {
    public static int[] removeConsecutiveDuplicates(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] temp = new int[arr.length];
        int j = 0;
        temp[j++] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                temp[j++] = arr[i];
            }
        }
        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 5, 6, 7, 8};
        int[] uniqueArr = removeConsecutiveDuplicates(arr);
        System.out.println("Array with consecutive duplicates removed: " + Arrays.toString(uniqueArr));
    }
}
