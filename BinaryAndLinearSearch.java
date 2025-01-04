public class BinaryAndLinearSearch {
    public static void main(String[] args) {
        int[] nums = new int[]{7, 9, 34, 78, 99, 100};
        System.out.println(nums.length);
        int target = 99;
        int result = binerySearch(nums, target, 0, nums.length - 1);
        if (result >= -1) {
            System.out.println("Located in index: " + result);
        } else {
            System.out.println("Target not found");
        }

    }

    private static int linearSearch(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static int binerySearch(int[] nums, int target, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else {
                return nums[mid] < target ? binerySearch(nums, target, mid + 1, end) : binerySearch(nums, target, start, mid - 1);
            }
        } else {
            return -1;
        }
    }


    
}
