public class maxwealth {
    // static int maximumWealth(int[][] accounts) {
    //     int value = 0;
    //     for(int row=0; row<accounts.length; row++){
    //         int rowsum = 0;
    //         for(int col=0; col<accounts[row].length; col++){
    //             rowsum += accounts[row][col];
    //         }
    //         if(rowsum > value){
    //             value = rowsum;
    //         }
    //     }
    //     return value;
    // }

    static int maximumWealth(int[][] accounts){
        int value = Integer.MIN_VALUE;
        for(int[] i : accounts){
            int sum = 0;
            for(int j : i){
                sum += j;
            }
        if(sum > value){
            value = sum;
        }
        }
        return value;
    }
    public static void main(String[] args) {
        // https://leetcode.com/problems/richest-customer-wealth/submissions/1708894369/
        int[][] arr = {
            {1,2,3},
            {3,2,1}
        };
        int[][]  arr1 = {
            {1,5},{7,3},{3,5}
        };

        System.out.println(maximumWealth(arr1));
        // dummy commit 1
        // dummy commit 2
        // dummy commit 3
        // dummy commit 4
        // dummy commit 5
        // dummy commit 6
    }
}
