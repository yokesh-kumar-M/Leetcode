public class plusone {
/*
    static int[] plusOne(int[] digits){
        int temp = 0;
        for(int i=0; i<digits.length-1; i++){
            temp = digits[i];
            temp *= 10;
        }
        temp /= 10;
        ++temp;

        int length = String.valueOf(temp).length();
        int[] result = new int[length];
        for(int i=length-1; i>=0; i--){
            result[i] = temp/10;
            temp /= 10;
        }
        return result;
    }
*/

    static plusOne(int[] digits){
        int length = digits.length;

        for(int i=digits-1; i>=0; i--){
            digits[i] += 1;

            digits[i] %= 10;
            if(digits[i] != 0){
                return digits;
            }
        }

        int[] result = new int[length + 1];
        result[0] = 1;

        return result;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {9};

        int[] farr = plusOne(arr);
        System.out.printf("[");
        for(int i=0; i<arr.length; i++){
            System.out.printf("%d,", farr[i]);
            
        }
        System.out.printf("]");
    }
    
}
