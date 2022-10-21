import java.util.Scanner;

public class Spil {
    public static int sum;
    public static void main(String[] args) {

        //Setup
        Scanner scan = new Scanner(System.in);

        Die die1, die2;

        String player = "Spiller ", name = ", skriv dit navn.", konto = " nye kontobeholdning: ", slag = " slog ";
        String press = "'s tur, tryk Enter for at rulle med terningerne", startK = " din start kontobeholdning = ";
        String grats = "Tillykke ", won = " du har vundet";

        die1 = new Die();
        die2 = new Die();

        Board board = new Board();

        Player player1, player2;
        System.out.println(player + "1" + name);
        player1 = new Player(scan.next(), 1000);
        System.out.println(player + "2" + name);
        player2 = new Player(scan.next(), 1000);
        System.out.println();
        System.out.println(player1.name + startK + player1.balance);
        System.out.println();
        System.out.println(player2.name + startK + player2.balance);
        //Setup slut
        //Spillet starter
        scan.nextLine();
        System.out.println();

        Player[] allPlayers = new Player[] {player1, player2};

        while (player1.balance < 3000 && player2.balance < 3000) {
            for (Player currentPlayer:allPlayers) {
                System.out.println("\n" + currentPlayer.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(currentPlayer.name + slag + sum);
                System.out.println(board.next(sum, 2));
                currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(sum, 0)));
                System.out.println(currentPlayer.name + "'s" + konto + currentPlayer.balance);
                if (player1.balance >= 3000) {
                    System.out.println(grats + currentPlayer.name + won);
                    break;
                }

                while (sum == 10)
                {
                    System.out.println();
                    System.out.println(currentPlayer.name + press);
                    scan.nextLine();
                    sum = die1.roll() + die2.roll();
                    System.out.println(currentPlayer.name + slag + sum);
                    System.out.println(board.next(sum, 2));
                    currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(sum, 0)));
                    System.out.println(currentPlayer.name +"'s" + konto + currentPlayer.balance);
                }

            }
        }
    }
}
