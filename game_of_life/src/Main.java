import gui.LifeDisplay;
import gui.LifeDisplayNew;
import gui.LifeFrame;
import logic.FastLifeBoard;
import logic.LifeBoard;
import logic.SimpleLifeBoard;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LifeBoard simpleBoard = new SimpleLifeBoard(buildArray());
        LifeBoard fastBoard = new FastLifeBoard(buildArray());
        LifeDisplay disp = new LifeDisplayNew(fastBoard);
        new LifeFrame(disp);
    }

    public static byte[][] buildArray() {
        byte[][] squares = new byte[50][50];
        squares[0][0] = 1;
        squares[1][1] = 1;
        squares[2][1] = 1;
        squares[0][2] = 1;
        squares[1][2] = 1;
        return squares;
    }
    
    public static long performanceTest(LifeBoard b, long stepCount) {
        long startTime = System.currentTimeMillis();
        for (long i = 0; i < stepCount; i++) {
            b.step();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}