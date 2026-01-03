import java.util.*;

// 202. Happy Number
public class HappyNumber {
    public static void main(String[] args) {
        int n = 2;

        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n){
        Set<Integer> seen = new HashSet<>();

        while(n != 1){
            if(seen.contains(n)){
                return false;
            }
            seen.add(n);
            n = looping(n);
        }
        return true;
    }
    static int looping(int n){
        int result = 0;
        while(n > 0){
            int temp = n%10;
            result += (temp*temp);
            n /= 10;
        }
        return result;
    }
    /**
    static boolean isHappy(int n) {
        while(n != 1 && n != 4) {
            int sum = 0;
            while(n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    } 
    **/
}
