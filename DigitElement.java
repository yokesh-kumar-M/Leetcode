// 2535. Difference Between Element Sum and Digit of an Array.
public class DigitElement {
    public static void main(String[] args) {
        int[] arr = {1, 15, 6, 3};
        System.out.println(differenceOfSum(arr));
    }

    static int differenceOfSum(int[] arr){
        int elementSum = 0;
        int digitSum = 0;


        for(int i : arr){
            elementSum += i;

            int temp = i;
            while(temp > 0){
                int sample = temp%10;
                digitSum += sample;
                temp /= 10;
            }
        }
        return elementSum - digitSum;
    }
    /**
    static int differenceOfSum(int[] arr){
        return elementSum(arr) - digitSum(arr);
    }
    static int elementSum(int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result += arr[i];
        }
        return result;
    }
    static int digitSum(int[] arr){
        int result = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 10){
                while(arr[i] > 0){
                    int remainder = arr[i] % 10;
                    result += remainder;
                    arr[i] /= 10;
                }
            } else{
                result += arr[i];
            }
        }
        return result;
    }
    **/
}
