public class SecondLargestSimple {
    public static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40};

        int max = arr[0];
        int secondMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Second largest number: " + secondMax);
    }
}









