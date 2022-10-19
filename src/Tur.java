public class Tur {
    public String Tur(int sum, Player player1) {
        while (player1.Acc < 3000) {
            switch (sum) {
                case 2:
                    player1.Acc += 250;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 3:
                    player1.Acc -= 100;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 4:
                    player1.Acc += 100;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 5:
                    player1.Acc -= 20;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 6:
                    player1.Acc += 180;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 7:
                    System.out.println("Du holder en pause i templet");
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 8:
                    player1.Acc -= 70;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 9:
                    player1.Acc += 60;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 10:
                    player1.Acc -= 80;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    System.out.println("Du er løbet ind i The Warewall, du får en ekstra tur!");
                case 11:
                    player1.Acc -= 50;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
                case 12:
                    System.out.println("Du har fundet guld i bjergene og sælger det for 650, du er rig!");
                    player1.Acc += 650;
                    System.out.println("Spiller 1's nuværende kontobeholdning: " + player1.Acc);
                    break;
            }
        }
        return player1.PName + player1.Acc;
    }
}
