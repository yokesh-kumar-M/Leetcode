public class findevennumberdigits {
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int i : nums){
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int nums){
        int numberofdigits = digits(nums);

        return numberofdigits % 2 == 0;
    }
    static int digits(int n){
        if(n < 0){
            n = n * -1;
        }
        if(n == 0){
            return 1;
        }
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}

    

