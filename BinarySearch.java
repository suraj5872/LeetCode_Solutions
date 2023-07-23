/*
Given an array of integers nums which is sorted in ascending order, and an integer target,
write a function to search target in nums.
If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.
*/


public class BinarySearch {
    public static int search(int[] nums, int target) {
        int middle = nums.length/2;
        for(int i=0;i<=nums.length;i++){
            if(nums[middle]>= target)
            {
                if(nums[i]==target){
                    return i;
                }
            }
            else{
                if(nums[i]==target){
                    return i;
                }
            }
        }
        return -1;
    }
    public  static  void main(String[] args)
    {
        int[] a= new int[]{-1,0,3,5,9,12};
        int t =9;
        System.out.println(search(a,t));
    }
}
