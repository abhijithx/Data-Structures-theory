public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{78, 9, 34,103 ,7 ,99, 100};
        int temp=0;
        System.out.println(" before sorting ");

        for (int i : nums) {
            System.out.print(i+"   ");
            
        }
        //logic for bubble sort
        for(int i= 0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                 if(nums[j]>nums[j+1]){
                    temp=nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                 }
            }
            System.out.println();
            for ( int num : nums) {
                System.out.print(num + " ");
            }
        }







        System.out.println();
        System.out.println(" after sorting ");
        for (int i : nums) {
            System.out.print(i+"   ");
        }
       
        
    
}
    }