// 3232. Find if Digit Game Can be Won.
public class DigitGame {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,10};

        System.out.println(canAliceWin(arr));

        // canAliceWin(arr);
    }
    static boolean canAliceWin(int[] arr){
        int s = 0, d = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 10){
                s += arr[i];
            }else{
            d += arr[i];
            }
        }
        if(s == d) return false;
        return true;
    }
}
