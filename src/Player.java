import java.util.Scanner;

public class Player {
    public String name;
    public int balance;

    public Player (String name, int amount){
        this.name = name;
        this.balance = amount;
    }
    public int getBalance() {
        return this.balance;
    }
    public void setBalance(int amount) {
        this.balance = amount;
    }

    public void speak() {
        System.out.println(this.name + " har nu " + this.balance + " point");
    }

}



