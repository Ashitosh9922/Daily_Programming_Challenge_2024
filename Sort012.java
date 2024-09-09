import java.util.*;
class Solution {
    public static void sort012(int[] nums) {
      int low=0;
      int mid=0;
      int high=nums.length-1;
      int temp;//for swapping
      while(mid<=high){
        switch(nums[mid])
        {
            case 0:
            //swap mid and low
            temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
            low++;
            mid++;
            break;

            case 1:
            mid++;
            break;

            case 2:
            //swap mid and high
            temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            break;

        }
      }
    }

public static void main(String args[]){
  int arr[]={0,1,2,0,1,2,0,1,2};
  sort012(arr);
  System.out.println(Arrays.toString(arr));
}
}
