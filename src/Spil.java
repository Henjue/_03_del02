import java.util.Scanner;
public class Spil {
    public static int sum;
    public static void main(String[] args) {
        //Setup
        Scanner scan = new Scanner(System.in);


        Die die1, die2;

        String b , player = "Spiller ", name = ", skriv dit navn.", konto = " nye kontobeholdning: ", slag = " slog ";
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
        b = scan.nextLine();
        System.out.println();

        while (player1.balance < 3000 && player2.balance < 3000)
        {
            System.out.println(player1.name + press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player1.name + slag + sum);
            System.out.println(board.next(sum));
            player1.setBalance(player1.balance + board.next(sum));
            System.out.println(player1.name +"'s" + konto + player1.balance);
            if (player1.balance >= 3000) {
                System.out.println(grats + player1.name + won);
                break;
            }
            System.out.println();
            System.out.println(player2.name + press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player2.name + slag + sum);
            System.out.println(board.next(sum));
            player2.setBalance(player1.balance + board.next(sum));
            System.out.println(player2.name +"'s" + konto + player2.balance);
            if (player2.balance >= 3000) {
                System.out.println(grats + player2.name + won);
                break;
            }
        }
    }
}
