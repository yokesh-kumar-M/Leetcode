public class Adddigit {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigit(num));
    }
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
}
