public class XORoperation{
    public static void main(String[] args) {
        int n = 4;
        int start = 3;

        System.out.println(xoroperation(n, start));
        
    }
    static int xoroperation(int n, int start){
        int result = 0;

        for(int i=0; i<n; i++){
            result ^= start;

            start += 2;
        }
        return result;
    }
}