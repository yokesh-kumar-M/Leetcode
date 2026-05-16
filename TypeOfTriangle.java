// 3024. Type of Triangle
public class TypeOfTriangle {
    static String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a + b <= c || a + c <= b || b + c <= a) {
            return "none";
        }
        if (a == b && b == c) {
            return "equilateral";
        }
        if (a == b || b == c || a == c) {
            return "isosceles";
        }
        return "scalene";
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8};
        System.out.println(triangleType(arr));
    }
}
