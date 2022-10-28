import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpiltestfilTest {

    @Test
    void main() {
        for(int i =0;i<1000;i++){
            Spiltestfil.main();
        }
        assertEquals(true,true);
    }
}