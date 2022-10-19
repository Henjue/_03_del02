import java.util.Scanner;

public class Spil {
    public static void main(String[] args) {
        //Setup
        Scanner scan = new Scanner(System.in);

        Die die1, die2;
        int sum;

        die1 = new Die();
        die2 = new Die();

        Player player1, player2;
        System.out.println("Spiller 1, skriv dit navn");
        player1 = new Player(scan.next(), 1000);
        System.out.println("Spiller 2, skriv dit navn");
        player2 = new Player(scan.next(), 1000);
        //Setup slut
        System.out.println(player1);
        System.out.println(player2);

        //Spillet starter
        sum = die1.roll() + die2.roll();
        System.out.println(sum);

        Tur tur1;
        tur1 = new Tur();

    }
}
