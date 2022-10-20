import java.util.Scanner;

public class Spil {
    public static int sum;
    public static void main(String[] args) {
        //Setup
        Scanner scan = new Scanner(System.in);

        Die die1, die2;

        String b, konto = " nye kontobeholdning: ", slag = " slog ", press = "Tryk Enter for at rulle med terningerne";

        die1 = new Die();
        die2 = new Die();

        Board board = new Board();

        Player player1, player2;
        System.out.println("Spiller 1, skriv dit navn");
        player1 = new Player(scan.next(), 1000);
        System.out.println("Spiller 2, skriv dit navn");
        player2 = new Player(scan.next(), 1000);
        System.out.println();
        System.out.println(player1.name);
        System.out.println();
        System.out.println(player2.name);
        //Setup slut
        //Spillet starter
        b = scan.nextLine();
        System.out.println();

        while (player1.balance < 3000 || player2.balance < 3000)
        {
            System.out.println(press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player1.name + slag + sum);
            System.out.println(board.next(sum));
            player1.setBalance(player1.balance + board.next(sum));
            System.out.println(player1.name +"'s" + konto + player1.balance);
            System.out.println(press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player2.name + slag + sum);
            System.out.println(board.next(sum));
            player2.setBalance(player1.balance + board.next(sum));
            System.out.println(player2.name +"'s" + konto + player2.balance);
        }

    }
}
