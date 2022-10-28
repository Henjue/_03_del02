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
    @org.junit.jupiter.api.Test //Tester samtlige int-værdier
    void getBalance2() {
        Player player = new Player("Name", 1000); //tilfældig værdi til at starte med
        for(int i = Integer.MIN_VALUE;i<Integer.MAX_VALUE;i++) {
            player.setBalance(i);
            assertEquals(i, player.getBalance());
        }
    }
}