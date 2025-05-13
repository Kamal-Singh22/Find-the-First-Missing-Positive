public class FirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Place nums[i] in its correct position if it's in the range [1, n]
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] and nums[nums[i] - 1]
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        // Find the first number not in the right position
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};
        int[] nums3 = {7, 8, 9, 11, 12};

        System.out.println("First missing positive (1): " + firstMissingPositive(nums1)); 
        System.out.println("First missing positive (2): " + firstMissingPositive(nums2)); 
        System.out.println("First missing positive (3): " + firstMissingPositive(nums3)); 
    }
}
