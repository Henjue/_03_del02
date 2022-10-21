
public class Board {

    String[][] felt = new String[][] { {},{},
            {"250", "Tower", "Du er ankommet til tårnet, du finder 250 kr. i en kiste."},
            {"-100", "Crater", "Du kører ned i et krater, det koster dig 100 kr. at komme op."},
            {"100", "Palace gates", "Vagterne ved paladsets port betaler dig 100 kr. for at køre væk, da du blokerer for adgang!"},
            {"-20", "Cold Desert", "Der er koldt i ørkenen, det koster dig 20 kr. at holde varmen kørende i bilen."},
            {"180", "Walled City", "Du stjæler fra nogle turister i byen, sælger byttet og får 180 kr."},
            {"0", "Monastery", "Du er træt og monkene i klostret giver dig et sted at sove."},
            {"-70", "Black cave", "Du farer vildt i en mørk grotte, og er nødt til at ringe efter hjælp, hjælpen koster dig 70 kr."},
            {"60", "Huts in the mountain", "Du finder nogle hytter i bjergene, du leder efter værdigenstande, du finder 60 kr."},
            {"-80", "The Werewall (werewolf-wall)", "Varulvene ved varulvevæggen skræmmer livet af dig, så du kører hurtigt videre, du får en ekstra tur, men det koster dig 80 kr."},
            {"-50", "The pit", "Din bil sidder fast i hullet, koster dig 50 kr. at få trukket den op."},
            {"650", "Goldmine", "Du har fundet guld i guldminen og sælger det for 650 kr., du er rig!"},
    };

    public Board() {}
    public String next(int rollTotal, int info) {

        //if (info == 0) {return Integer.parseInt(felt[rollTotal][0]);}
        return felt[rollTotal][info];
    }
}
