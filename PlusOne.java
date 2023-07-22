/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. 
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.
*/
public class PlusOne {
    public static int[] plusOne(int[] digits)
    {
        int n = digits.length;
        int i=n-1;
        while(i >= 0){
            if(digits[i] < 9){
                digits[i]++;
                return  digits;
            }
            digits[i]=0;
            i--;
        }
        int[] result = new int[n+1];
        result[0]=1;
        return result;
    }
    public static void main(String[] args){
        int[] digits = {9};

        int[] result1 = plusOne(digits);
        // Output: [1, 2, 4]
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
    }
}
