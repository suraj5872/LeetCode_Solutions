import java.util.Arrays;

public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int[] result = new int[accounts.length];
        int mx=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for (int j=0;j<accounts[0].length;j++)
            {
                sum+=accounts[i][j];
            }
            mx=Math.max(mx,sum);
        }

        return mx;

    }

    public static void main(String[] args) {
        int[][] n ={{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(n));
    }
}
