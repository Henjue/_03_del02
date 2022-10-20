import java.util.HashMap;
import java.util.Map;

public class Board {

    Map<Integer,Integer> squares = new HashMap<Integer, Integer>() {
        {
            put(2,  250);
            put(3, -100);
            put(4,  100);
            put(5,  -20);
            put(6,  180);
            put(7,    0);
            put(8,  -70);
            put(9,   60);
            put(10, -80);
            put(11, -50);
            put(12, 650);
        }
    };

    public Board() {
    }
    public int next(int rollTotal) {
        return (int) squares.get(rollTotal);
    }

}
