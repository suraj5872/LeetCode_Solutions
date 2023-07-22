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
