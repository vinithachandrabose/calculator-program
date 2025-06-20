import java.util.ArrayList;

public class RemovePrimesSimple {
    
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
       
        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Create ArrayList and add array elements
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            list.add(num);
        }

        System.out.println("Original List: " + list);

       
        list.removeIf(n -> isPrime(n));

        System.out.println("List after removing primes: " + list);
    }
}
