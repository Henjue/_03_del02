public class Spiltestfil {

    public static int sum;
    public static int lang; //0: Danish, 1: English, 2: Swahili
    public static void main() {


        Die die1, die2;
        die1 = new Die();
        die2 = new Die();
        Board board = new Board();
        lang = 0;

        String[] press_lang = new String[]         {"'s tur, tryk Enter for at rulle med terningerne", "'s turn, press Enter to roll the dice", "geuza, bonyeza Enter ili kukunja kete"};
        String[] konto_lang = new String[]         {" nye kontobeholdning: ", " new account balance: ", " salio la akaunti: "};
        String[] playerString_lang = new String[]  {"Spiller ", "Player ", "Wachezaji "};
        String[] name_lang = new String[]          {", skriv dit navn.", ", write your name.", ", andika jina lako."};
        String[] rolled_lang = new String[]        {" slog ", " rolled ", " akavingirisha "};
        String[] grats_lang = new String[]         {"Tillykke ", "Congratulations ", "Hongera sana "};
        String[] won_lang = new String[]           { " du har vundet", " you have won", " Umeshinda"};
        String[] tabt_lang = new String[]          {", kan ikke betale og taber derfor spillet", ", can't pay and therefore loses the game", ", haiwezi kulipa na hivyo kupoteza mchezo"};
        String press = press_lang[lang];
        String konto = konto_lang[lang];
        String playerString = playerString_lang[lang];
        String name = name_lang[lang];
        String rolled = rolled_lang[lang];
        String grats = grats_lang[lang];
        String won = won_lang[lang];
        String tabt = tabt_lang[lang];
        boolean vundet = false;

        Player player1, player2;
        System.out.println(playerString + "1" + name);
        player1 = new Player("Lars", 1000);
        System.out.println(playerString + "2" + name);
        player2 = new Player("Anton", 1000);

        // Printer spillernes start kontobeholdning
        System.out.println("\n" + player1.name + konto + player1.balance);
        System.out.println("\n" + player2.name + konto + player2.balance);
                // Samler spillerne i et array
        Player[] allPlayers = new Player[] {player1, player2};

        // Spillet starter
        while (!vundet) {
            // Itererer over spillerne
            for (Player currentPlayer:allPlayers) {
                System.out.println("\n\n" + currentPlayer.name + press);
                sum = die1.roll() + die2.roll();
                System.out.println(currentPlayer.name + rolled + sum);
                System.out.println(board.next(lang, sum, 1) + ": " + board.next(lang, sum, 2));
                currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                if (currentPlayer.balance<0) {System.out.println(currentPlayer.name + tabt); System.exit(0);} // hvis kontobeholdning < 0 taber man
                System.out.println(currentPlayer.name + "'s" + konto + currentPlayer.balance);
                // Tjekker om en spiller har vundet
                if (currentPlayer.balance >= 3000) {
                    System.out.println(grats + currentPlayer.name + won);
                    vundet = true;
                }

                while (sum == 10)   // Hvis en spiller har slået 10 øjne
                {
                    System.out.println("\n\n" + currentPlayer.name + press);
                    sum = die1.roll() + die2.roll();
                    System.out.println(currentPlayer.name + rolled + sum);
                    System.out.println(board.next(lang, sum, 2));
                    currentPlayer.setBalance(currentPlayer.balance + Integer.parseInt(board.next(lang, sum, 0)));
                    if (currentPlayer.balance<0) {System.out.println(currentPlayer.name + tabt); System.exit(0);} // hvis kontobeholdning < 0 taber man
                    System.out.println(currentPlayer.name +"'s" + konto + currentPlayer.balance);
                    // Tjekker om en spiller har vundet
                    if (currentPlayer.balance >= 3000) {
                        System.out.println(grats + currentPlayer.name + won);
                        vundet = true;
                    }
                }
            }
        }
    }
}
