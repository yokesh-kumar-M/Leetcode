// 2894. Divisible and Non-divisible Sums Difference
public class DivisibleSum {
    public static void main(String[] args) {
        int n = 5;
        int m = 1;
        System.out.println(differenceOfSums(n, m));
    }
    static int differenceOfSums(int n, int m){
        int num1 = 0;
        int num2 = 0;

        for(int i=1; i<=n; i++){
            if(i%m == 0){
                num1 += i;
            } else{
                num2 += i;
            }
        }
        return num2 - num1;
    }

    /**
    static int differenceOfSum(int n, int m){
        int divSum = m*((n/m) * ((n/m) + 1))/2;
        return ((n*(n+1))/2) - (2*divSum);
    }
    **/
}
