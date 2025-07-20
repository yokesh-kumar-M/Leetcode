public class Sumofpowerthree {
    static void checkPowersOfThree(int n){
        int s = n/3;
        int result = 0;
        for(int i=0; i<s; i++){
            result += Math.pow(i,3);
            System.out.println(Math.pow(3,i));
            if(result == n){
                System.out.println("N:"+n);
            }
        }
        // return false;
    }
    public static void main(String args[]){
        int n1 = 12, n2 = 91, n3 = 21;
        //System.out.println(checkPowersOfThree(n1));
        checkPowersOfThree(n2);
        checkPowersOfThree(n2);

    }
}
