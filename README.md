

75. Sort Colors

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.
---------------------------------------------------------
class Solution {
    public void sortColors(int[] nums) {
        int i,j,temp;
        for(i=0;i<nums.length;i++)
        {
            for(j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;              
                }
                
            }
           
        }
    }
}
