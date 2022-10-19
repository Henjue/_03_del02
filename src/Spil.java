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

        Player player1, player2;
        System.out.println("Spiller 1, skriv dit navn");
        player1 = new Player(scan.next(), 1000);
        System.out.println("Spiller 2, skriv dit navn");
        player2 = new Player(scan.next(), 1000);
        System.out.println();
        System.out.println(player1);
        System.out.println();
        System.out.println(player2);
        //Setup slut
        //Spillet starter
        b = scan.nextLine();
        System.out.println();

        while (player1.Acc < 3000 || player2.Acc < 3000)
        {
            System.out.println(press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player1.PName + slag + sum);
            player1.Acc += Felt.Feltvalue; //LORTET VIRKER IKKE!!!!
            System.out.println(Felt.Feltvalue);
            System.out.println(player1.PName +"'s" + konto + player1.Acc);
            System.out.println(press);
            b = scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player2.PName + slag + sum);
            player2.Acc += Felt.Feltvalue;
            System.out.println(player2.PName +"'s" + konto + player2.Acc);
        }

    }
}
