import java.util.Scanner;

public class Spil {
    public static int sum;
    public static void main(String[] args) {
        //Setup
        Scanner scan = new Scanner(System.in);
        String[] felter = new String[11];
        felter[0] = "Du er ankommet til tårnet, du finder 250 kr. i en kiste.";
        felter[1] = "Du kører ned i et krater, det koster dig 100 kr. at komme op.";
        felter[2] = "Vagterne ved paladsets port betaler dig 100 kr. for at køre væk, da du blokerer for adgang!";
        felter[3] = "Der er koldt i ørkenen, det koster dig 20 kr. at holde varmen kørende i bilen.";
        felter[4] = "Du stjæler fra nogle turister i byen, sælger byttet og får 180 kr.";
        felter[5] = "Du er træt og monkene i klostret giver dig et sted at sove.";
        felter[6] = "Du farer vildt i en mørk grotte, og er nødt til at ringe efter hjælp, hjælpen koster dig 70 kr.";
        felter[7] = "Du finder nogle hytter i bjergene, du leder efter værdigenstande, du finder 60 kr.";
        felter[8] = "Varulvene ved varulvevæggen skræmmer livet af dig, så du kører hurtigt videre, du får en ekstra tur, men det koster dig 80 kr.";
        felter[9] = "Din bil sidder fast i hullet, koster dig 50 kr. at få trukket den op.";
        felter[10] = "Du har fundet guld i guldminen og sælger det for 650 kr., du er rig!";


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

        while (player1.balance < 3000 && player2.balance < 3000)
        {
            System.out.println();
            System.out.println(player1.name + press);
            scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player1.name + slag + sum);
            System.out.println(felter[sum-2]);
            player1.setBalance(player1.balance + board.next(sum));
            System.out.println(player1.name +"'s" + konto + player1.balance);
            if (player1.balance >= 3000) {
                System.out.println(grats + player1.name + won);
                break;
            }

            while (sum == 10)
            {
                System.out.println();
                System.out.println(player1.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(player1.name + slag + sum);
                System.out.println(felter[sum-2]);
                player1.setBalance(player1.balance + board.next(sum));
                System.out.println(player1.name +"'s" + konto + player1.balance);
            }
            System.out.println();
            System.out.println(player2.name + press);
            scan.nextLine();
            sum = die1.roll() + die2.roll();
            System.out.println(player2.name + slag + sum);
            System.out.println(felter[sum-2]);
            player2.setBalance(player2.balance + board.next(sum));
            System.out.println(player2.name +"'s" + konto + player2.balance);
            if (player2.balance >= 3000) {
                System.out.println(grats + player2.name + won);
                break;
            }

            while (sum == 10)
            {
                System.out.println();
                System.out.println(player2.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(player2.name + slag + sum);
                System.out.println(felter[sum-2]);
                player2.setBalance(player2.balance + board.next(sum));
                System.out.println(player2.name +"'s" + konto + player2.balance);
            }
        }
    }
}
