
public class Board {

    //Et String Array på formen [language][rollTotal][information]
    String[][][] felt = new String[][][]{

            //Danish
            {
                    {"250", "Tårnet", "Du er ankommet til tårnet, du finder 250 kr. i en kiste."},
                    {"-100", "Krateret", "Du kører ned i et krater, det koster dig 100 kr. at komme op."},
                    {"100", "Paladsporten", "Vagterne ved paladsets port betaler dig 100 kr. for at køre væk, da du blokerer for adgang!"},
                    {"-20", "Den kolde ørken", "Der er koldt i ørkenen, det koster dig 20 kr. at holde varmen kørende i bilen."},
                    {"180", "Den afskærmede by", "Du stjæler fra nogle turister i byen, sælger byttet og får 180 kr."},
                    {"0", "Klostret", "Du er træt og monkene i klostret giver dig et sted at sove."},
                    {"-70", "Den mørke grotte", "Du farer vildt i en mørk grotte, og er nødt til at ringe efter hjælp, hjælpen koster dig 70 kr."},
                    {"60", "Hytterne i bjergene", "Du finder nogle hytter i bjergene, du leder efter værdigenstande, du finder 60 kr."},
                    {"-80", "Varulvevæggen", "Varulvene ved varulvevæggen skræmmer livet af dig, så du kører hurtigt videre, du får en ekstra tur, men det koster dig 80 kr."},
                    {"-50", "Hullet", "Din bil sidder fast i hullet, koster dig 50 kr. at få trukket den op."},
                    {"650", "Guldminen", "Du har fundet guld i guldminen og sælger det for 650 kr., du er rig!"},
            },
            //English
            {
                    {"250", "TheTower", "You have arrived at the tower, you find DKK 250 in a chest."},
                    {"-100", "The Crater", "You drive into a crater, it costs you DKK 100 to get up."},
                    {"100", "The Palace gates", "The guards at the palace gate will pay you DKK 100 to drive away as you block access!"},
                    {"-20", "The Cold Desert", "It's cold in the desert, it costs you DKK 20 to keep the heat running in the car."},
                    {"180", "The Walled City", "You steal from some tourists in the city, sell the loot and get DKK 180."},
                    {"0", "The Monastery", "You are tired and the monks in the monastery give you a place to sleep."},
                    {"-70", "The Black cave", "You get lost in a dark cave and have to call for help, the help will cost you DKK 70."},
                    {"60", "The Huts in the mountain", "You find some huts in the mountains, you look for valuables, you find DKK 60."},
                    {"-80", "The Werewall (werewolf-wall)", "The werewolves at the werewolf wall scare the life out of you, so you drive on quickly, you get an extra turn, but it costs you DKK 80."},
                    {"-50", "The pit", "Your car is stuck in the hole, it costs you DKK 50 to have it pulled up."},
                    {"650", "The Goldmine", "You have found gold in the gold mine and are selling it for DKK 650, you are rich!"},
            },
            //Swahili
            {
                    {"250", "Mnara", "Umefika kwenye mnara, unakuta DKK 250 kwenye kifua."},
                    {"-100", "Crater", "Unaendesha gari kwenye kreta, inakugharimu DKK 100 kuamka."},
                    {"100", "Lango la Ikulu", "Walinzi kwenye lango la ikulu watakulipa DKK 100 ili uendeshe gari unapozuia ufikiaji!"},
                    {"-20", "Jangwa Baridi", "Kuna baridi jangwani, inakugharimu DKK 20 kuweka joto kwenye gari."},
                    {"180", "Jiji lenye ukuta", "Unaiba kutoka kwa baadhi ya watalii mjini, unauza nyara na kupata DKK 180."},
                    {"0", "Monasteri", "Umechoka na watawa katika monasteri wanakupa mahali pa kulala."},
                    {"-70", "Pango jeusi", "Unapotea kwenye pango lenye giza na itabidi upige simu ili usaidiwe, usaidizi utakugharimu DKK 70."},
                    {"60", "Vibanda mlimani", "Unapata vibanda milimani, unatafuta vitu vya thamani, unapata DKK 60."},
                    {"-80", "The Werewall (werewolf-wall)", "Werewall kwenye ukuta wa werewolf wanakuogopesha, kwa hivyo unaendesha gari haraka, unapata zamu ya ziada, lakini inakugharimu DKK 80."},
                    {"-50", "Shimo", "Gari lako limekwama kwenye shimo, inakugharimu DKK 50 kuinuliwa."},
                    {"650", "Goldmine", "Umepata dhahabu kwenye mgodi wa dhahabu na unaiuza kwa DKK 650, wewe ni tajiri!"},
            }
    };

    public Board() {}

    //Returnerer én String fra String Array'et felt på et bestemt sprog
    public String next(int lang, int rollTotal, int info) {
        return felt[lang][rollTotal-2][info];
    }
}
