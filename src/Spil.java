import java.util.Scanner;

public class Spil {
    public static int sum;
    public static void main(String[] args) {


        // Setup
        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        Board board = new Board();
        Scanner scan = new Scanner(System.in);
        int lang = 2; //0: Danish, 1: English, 2: Swahili


        String[] press_lang = new String[]         {"'s tur, tryk Enter for at rulle med terningerne", "'s turn, press Enter to roll the dice", "geuza, bonyeza Enter ili kukunja kete"};
        String[] konto_lang = new String[]         {" nye kontobeholdning: ", "new account balance: ", "salio la akaunti: "};
        String[] playerString_lang = new String[]  {"Spiller ", "Player ", "Wachezaji "};
        String[] name_lang = new String[]          {", skriv dit navn.", ", write your name.", ", andika jina lako."};
        String[] rolled_lang = new String[]        {" slog ", " rolled ", " akavingirisha "};
        String[] grats_lang = new String[]         {"Tillykke ", "Congratulations ", "Hongera sana "};
        String[] won_lang = new String[]           { " du har vundet", " you have won", " Umeshinda"};
        String press = press_lang[lang];
        String konto = konto_lang[lang];
        String playerString = playerString_lang[lang];
        String name = name_lang[lang];
        String rolled = rolled_lang[lang];
        String grats = grats_lang[lang];
        String won = won_lang[lang];

        Player player1, player2;
        System.out.println(playerString + "1" + name);
        player1 = new Player(scan.next(), 1000);
        System.out.println(playerString + "2" + name);
        player2 = new Player(scan.next(), 1000);

        // Printer spillernes start kontobeholdning
        System.out.println("\n" + player1.name + konto + player1.balance);
        System.out.println("\n" + player2.name + konto + player2.balance + "\n\n");

        scan.nextLine();

        // Samler spillerne i et array
        Player[] allPlayers = new Player[] {player1, player2};

        // Spillet starter
        while (player1.balance < 3000 && player2.balance < 3000) {
            // Itererer over spillerne
            for (Player currentPlayer:allPlayers) {
                System.out.println("\n\n" + currentPlayer.name + press);
                scan.nextLine();
                sum = die1.roll() + die2.roll();
                System.out.println(currentPlayer.name + rolled + sum);
                System.out.println(board.next(lang, sum, 2));
                currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                if (currentPlayer.balance<0) {currentPlayer.setBalance(0);} // hvis kontobeholdning < 0, sættes konto = 0
                System.out.println(currentPlayer.name + "'s" + konto + currentPlayer.balance);
                // Tjekker om en spiller har vundet
                if (currentPlayer.balance >= 3000) {
                    System.out.println(grats + currentPlayer.name + won);
                    break;
                }

                while (sum == 10)   // Hvis en spiller har slået 10 øjne
                {
                    System.out.println("\n\n" + currentPlayer.name + press);
                    scan.nextLine();
                    sum = die1.roll() + die2.roll();
                    System.out.println(currentPlayer.name + rolled + sum);
                    System.out.println(board.next(lang, sum, 2));
                    currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                    if (currentPlayer.balance<0) {currentPlayer.setBalance(0);} // hvis kontobeholdning < 0, sættes konto = 0
                    System.out.println(currentPlayer.name +"'s" + konto + currentPlayer.balance);
                    // Tjekker om en spiller har vundet
                    if (currentPlayer.balance >= 3000) {
                        System.out.println(grats + currentPlayer.name + won);
                        break;
                    }
                }
            }
        }
    }
}
