
import java.util.PriorityQueue;

class KthLargestElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

       
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.add(num);

            
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest
            }
        }

        System.out.println(k + "th largest element is: " + minHeap.peek());
    }
}
