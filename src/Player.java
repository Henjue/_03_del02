public class Player {
    public String name;
    public int balance;

    public Player (String name, int amount){
        this.name = name;
        this.balance = amount;
        if (this.balance>0) {
            this.balance = 0;
        }
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int amount) {
        this.balance = amount;
        if (this.balance>0) {
            this.balance = 0;
        }
    }

    // Printer spillerens specifikke attributter
    public void speak() {
        System.out.println(this.name + " har nu " + this.balance + " point");
    }

}



