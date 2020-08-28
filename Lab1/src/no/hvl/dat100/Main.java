package no.hvl.dat100;

public class Main {
    public static void main(String[] args) {
        int amount = 10;
        Star(amount);
        System.out.println("\nNå virker det");
        Star(10);
    }

    public static void Star(int amount) {
        int i = 0;
        while(amount > i){
            System.out.print("*");
            i++;
        }
    }
}
