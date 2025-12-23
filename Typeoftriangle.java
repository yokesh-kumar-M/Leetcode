// 3024. Type of a Triangle
public class Typeoftriangle {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8};

        System.out.println(triangleType(arr));
    }
    static String triangleType(int[] nums){
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        // if sum of sides is not greater than the third side
        if(a + b <= c || a + c <= b || b + c <= a){
            return "none";
        }
        // All sides are equal
        if(a == b && b == c){
            return "equilateral";
        }
        // Only two sides of a triangle is equal
        if(a == b || b == c || a == c){
            return "isosceles";
        }
        // Due to complexity in finding the scalene we used it as a default case.
        return "scalene";
    }
}
