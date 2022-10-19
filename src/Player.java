public class Player {
    public String PName;
    public int Acc;

    public Player (String name, int account)
    {
        PName = name;
        Acc = account;
    }
    public String toString()
    {
        String player;

        player = PName + "'s " + "Kontobeholding: " + Acc;
        return player;
    }
}
