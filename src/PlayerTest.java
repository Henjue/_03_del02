import static org.junit.jupiter.api.Assertions.*;
import java.util.random.RandomGenerator;

class PlayerTest {
    //Tester at det grundlæggende fungerer
    @org.junit.jupiter.api.Test
    void getBalance1() {
        Player player = new Player("Name", 1000);
        player.setBalance(1000);
        assertEquals(1000, player.balance);
    }

    /*
        @org.junit.jupiter.api.Test
        void setBalance() {
        }

     */
    @org.junit.jupiter.api.Test
    void getBalance2() {
        Player player = new Player("Name", 1000);
        player.setBalance(1000);
        assertEquals(1000, player.balance);
    }
}