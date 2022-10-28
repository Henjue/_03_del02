import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void roll() {
        Die die = new Die();
        for(int i = 0;i<10000;i++) {
            int x = die.roll();
            if (!(x == 1 || x == 2 ||x == 3 ||x == 4 ||x == 5 ||x == 6)) {
                assertEquals(true, false);
            }
            else{
                assertEquals(true,true);
            }
        }
    }

    @Test
    void setFaceValue() {
    }

    @Test
    void getFaceValue() {
    }

    @Test
    void testToString() {
    }
}