public class Player {
    public String PName;
    public int Acc;

    public Player (String name, int StaAcc)
    {
        PName = name;
        Acc = StaAcc;
    }
    public String toString()
    {
        String player;

        player = "Spiller 1: " + PName + " " + "Kontobeholding: " + Acc;
        return player;
    }
}
