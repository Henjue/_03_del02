import java.util.Scanner;

public class Spil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Die die1, die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        Player player1, player2;

        player1 = new Player(scan.next(), 1000);
        player2 = new Player(scan.next(), 1000);

    }
}