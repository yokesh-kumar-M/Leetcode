// 657. Robot return to Origin
public class RobotReturn {
    public static void main(String[] args) {
        String word = "RLUURDDDLU";

        System.out.println(judgeCircle(word));
    }
    static boolean judgeCircle(String moves){
        int n = moves.length();
        int[] side = new int[4];
        for(int i=0; i<n; i++){
            if(moves.charAt(i) == 'U'){
                side[0] += 1;
            }
            if(moves.charAt(i) == 'D'){
                side[1] += 1;
            }
            if(moves.charAt(i) == 'L'){
                side[2] += 1;
            }
            if(moves.charAt(i) == 'R'){
                side[3] += 1;
            }
        }
        if(side[0] != side[1] || side[2] != side[3]){
            return false;
        }
        return true;
    }
    /**
    static boolean judgeCircle(String moves){
        int x = 0, y = 0;

        for(char i : moves.toCharArray()){
            switch(i){
                case 'U': x++; break;
                case 'D': x--; break;
                case 'L': y--; break;
                case 'R': y++; break;
            }
        }
        return x == 0 && y == 0;
    } 
    **/
}
