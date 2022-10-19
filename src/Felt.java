public class Felt {
    public static int Feltvalue;

    private int Feltval(int sum, int Feltvalue) {
        while (Feltvalue < 3000) {
            switch (Spil.sum) {
                case 2:
                    Feltvalue += 250;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 3:
                    Feltvalue -= 100;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 4:
                    Feltvalue += 100;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 5:
                    Feltvalue -= 20;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 6:
                    Feltvalue += 180;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 7:
                    System.out.println("Du holder en pause i templet");
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 8:
                    Feltvalue -= 70;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 9:
                    Feltvalue += 60;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 10:
                    Feltvalue -= 80;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    System.out.println("Du er løbet ind i The Warewall, du får en ekstra tur!");
                case 11:
                    Feltvalue -= 50;
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
                case 12:
                    Feltvalue += 650;
                    System.out.println("Du har fundet guld i bjergene og sælger det for 650, du er rig!");
                    //System.out.println("Spiller 1's nuværende kontobeholdning: " + Feltvalue);
                    break;
            }
        }
        return Feltvalue;
    }

    public String toString()
    {
        return Integer.toString(Feltvalue);
    }
}
