import javax.swing.*;

public class Karakter {

    public static void main(String[] args) {

        int i = 1;
        for (char karakter: Karakterer()) {

            System.out.println("Student " + i + " sin karakter er " + karakter);
            i++;
        }

    }

    public static char[] Karakterer(){
        int antall = SingleTen();
        char[] karakterer = new char[antall];
        int poeng = 0;

        for(int i = 0; i< antall; i++) {
            String poengsum = JOptionPane.showInputDialog("Skriv inn din poengsum");
            poeng = Integer.parseInt(poengsum);
            while(poeng >= 101 || poeng <= -1){
                poengsum = JOptionPane.showInputDialog("Skriv inn din poengsum, vennligst en gyldig en");
                poeng = Integer.parseInt(poengsum);
            }

            karakterer[i] = Karakter(poeng);
        }

        return karakterer;
    }


    public static char Karakter(int poeng) {
        char karakter = 'F';


            if (poeng < 40) {
                karakter = 'F';
            } else if (poeng < 50) {
                karakter = 'E';
            } else if (poeng < 60) {
                karakter = 'D';
            } else if (poeng < 80) {
                karakter = 'C';
            } else if (poeng < 90) {
                karakter = 'B';
            } else {
                karakter = 'A';
            }


        return karakter;
    }

    public static int SingleTen() {
        int antall;

        String[] options = {"En enkel student", "Ti studenter"};
        int x = JOptionPane.showOptionDialog(null, "Hvor mange studenter har tatt prøven?",
                "Velg antall studenter", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                options, options[0]);

        switch (x) {
            case 0:
                antall = 1;
                break;
            case 1:
                antall = 10;
                break;
            default:
                antall = 1;
        }
        return antall;

    }
}
