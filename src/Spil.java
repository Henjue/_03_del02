import java.util.Scanner;
public class Spil {
    public static int sum;
    public static void main(String[] args) {

        //Setup
        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        Board board = new Board();
        Scanner scan = new Scanner(System.in);

        String press = "'s tur, tryk Enter for at rulle med terningerne", konto = " nye kontobeholdning: ";

        Player player1, player2;
        System.out.println("Spiller " + "1" + ", skriv dit navn.");
        player1 = new Player(scan.next(), 1000);
        System.out.println("Spiller " + "2" + ", skriv dit navn.");
        player2 = new Player(scan.next(), 1000);

        System.out.println("\n" + player1.name + " din start kontobeholdning = " + player1.balance);
        System.out.println("\n" + player2.name + " din start kontobeholdning = " + player2.balance + "\n\n");
        //Setup slut
        //Spillet starter
        scan.nextLine();

        Player[] allPlayers = new Player[] {player1, player2};

        while (player1.balance < 3000 && player2.balance < 3000) {
            for (Player currentPlayer:allPlayers) {
                System.out.println("\n\n" + currentPlayer.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(currentPlayer.name + " slog " + sum);
                System.out.println(board.next(sum, 2));
                currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(sum, 0)));
                System.out.println(currentPlayer.name + "'s" + konto + currentPlayer.balance);
                if (currentPlayer.balance >= 3000) {
                    System.out.println("Tillykke " + currentPlayer.name + " du har vundet");
                    break;
                }

                while (sum == 10)
                {
                    System.out.println("\n\nSlå igen, " + currentPlayer.name);
                    scan.nextLine();
                    sum = die1.roll() + die2.roll();
                    System.out.println(currentPlayer.name + " slog " + sum);
                    System.out.println(board.next(sum, 2));
                    currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(sum, 0)));
                    System.out.println(currentPlayer.name +"'s" + konto + currentPlayer.balance);
                    if (currentPlayer.balance >= 3000) {
                        System.out.println("Tillykke " + currentPlayer.name + " du har vundet");
                        break;
                    }
                }

            }
        }
    }
}
