// 657. Robot Return to Origin
import java.util.logging.Logger;

public class RobotReturn {
    private static final Logger LOGGER = Logger.getLogger(RobotReturn.class.getName());

    private RobotReturn() {
    }

    static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U': y++; break;
                case 'D': y--; break;
                case 'L': x--; break;
                case 'R': x++; break;
                default: break;
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        LOGGER.info(() -> String.valueOf(judgeCircle("RLUURDDDLU")));
    }
}
