import java.util.Arrays;

// 88. Merge sorted Array
public class MergeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int m = 3;
        int[] arr2 = {2,5,6};
        int n = 3;

        merge(arr1, m, arr2, n);

        System.out.println(Arrays.toString(arr1));
    }
    static void merge(int[] arr1, int m, int[] arr2, int n){
        int pink = m + n - 1;
        int red = m - 1;
        int blue = n - 1;

        while(red >= 0 && blue >= 0){
            if(arr1[red] > arr2[blue]){
                arr1[pink] = arr1[red];
                red--;
                pink--;
            } else{
                arr1[pink] = arr2[blue];
                blue--;
                pink--;
            }
        }
        while(blue >= 0){
            arr1[pink] = arr2[blue];
            pink--;
            blue--;
        }
    }
}
