public class Adddigit {
    // 258 - Add Digit
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigit(num));
    }
    // https://leetcode.com/problems/add-digits/submissions/1862258899/?envType=problem-list-v2&envId=prshgx6i
    static int addDigit(int num){
        if(num < 10){
            return num;
        }
        int sum = 0;
        while(num != 0){
            sum += num%10;
            num /= 10;
        }

        return addDigit(sum);
    }

    /**
    static int addDigits(int num){
        if(num == 0){
            return 0;
        } else if(num%9 == 0){
            return 9; 
        } else{
            return num%9;    
        }
    } 
    **/
}
