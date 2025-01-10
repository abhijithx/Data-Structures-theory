public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = new int[]{2,0,2,1,1,0};
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
            // System.out.println();
            // for ( int num : nums) {
            //     System.out.print(num + " ");
            // }
        }







        System.out.println();
        System.out.println(" after sorting ");
        for (int i : nums) {
            System.out.print(i+"   ");
        }
       
        
    
}
    }