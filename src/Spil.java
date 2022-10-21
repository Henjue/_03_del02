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
        int lang = 2; //0: Danish, 1: English, 2: Swahili

        String press = "'s tur, tryk Enter for at rulle med terningerne", konto = " nye kontobeholdning: ";
        String playerString = "Spiller ", name = ", skriv dit navn.", rolled = " slog ", grats = "Tillykke ", won = " du har vundet";

        Player player1, player2;
        System.out.println(playerString + "1" + name);
        player1 = new Player(scan.next(), 1000);
        System.out.println(playerString + "2" + name);
        player2 = new Player(scan.next(), 1000);

        System.out.println("\n" + player1.name + konto + player1.balance);
        System.out.println("\n" + player2.name + konto + player2.balance + "\n\n");
        //Setup slut
        //Spillet starter
        scan.nextLine();

        Player[] allPlayers = new Player[] {player1, player2};

        while (player1.balance < 3000 && player2.balance < 3000) {
            for (Player currentPlayer:allPlayers) {
                System.out.println("\n\n" + currentPlayer.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(currentPlayer.name + rolled + sum);
                System.out.println(board.next(lang, sum, 2));
                currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                System.out.println(currentPlayer.name + "'s" + konto + currentPlayer.balance);
                if (currentPlayer.balance >= 3000) {
                    System.out.println(grats + currentPlayer.name + won);
                    break;
                }

                while (sum == 10)
                {
                    System.out.println("\n\n" + currentPlayer.name + press);
                    scan.nextLine();
                    sum = die1.roll() + die2.roll();
                    System.out.println(currentPlayer.name + rolled + sum);
                    System.out.println(board.next(lang, sum, 2));
                    currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                    System.out.println(currentPlayer.name +"'s" + konto + currentPlayer.balance);
                    if (currentPlayer.balance >= 3000) {
                        System.out.println(grats + currentPlayer.name + won);
                        break;
                    }
                }
            }
        }
    }
}
