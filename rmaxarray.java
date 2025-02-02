public class rmaxarray {
    public static void main(String[] args) {
        int[] arr = {22, 10, 8, 03, 2, 8, 03};
        
        int min = arr[0], max = arr[0];

        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.println("Smallest in Array: " + min);
        System.out.println("Largest in Array: " + max);
    }
}
