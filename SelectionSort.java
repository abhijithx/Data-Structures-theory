public class SelectionSort {
    public static void main(String[] args) {
       
            int[] nums = new int[]{6,8,2,5,1,56,8,0};
            int size = nums.length; 
            System.out.println(size );
            int minIndex =-1;
            int temp=0;
            System.out.println(" before sorting ");
    
            for (int i : nums) {
                System.out.print(i+"   ");
                
            }
    
            for (int i = 0; i < size-1; i++) {
                minIndex = i;
                for (int j = i+1 ; j < size; j++) {
                    if (nums[minIndex] >nums[j]) {
                        minIndex = j;
                        
                    }

                   
                }
                temp = nums[minIndex];
                nums[minIndex] = nums[i];
                nums[i] = temp;
            }
          
    
    
    
    
            System.out.println();
            System.out.println(" after sorting ");
            for (int n: nums) {
                System.out.print(n+"   ");
            }
           
            
        
    }
    
}
