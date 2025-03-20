import java.util.Arrays;

public class rduplicatearray {
    public static int[] duplicatehtado(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, j = 0;

        int[] temp = new int[n];
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        return Arrays.copyOf(temp, j);
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 4, 2, 2, 8, 9, 33,3,3,3,3,3,3,4,4,4,4,4,5,10,1010,10};
        int[] finalarray = duplicatehtado(arr);

        System.out.println("Original Array : " + Arrays.toString(finalarray));
    }
}
