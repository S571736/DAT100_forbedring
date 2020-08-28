import javax.swing.*;

public class Fakultet {

    public static void main(String[] args) {
        int n = 0;
        while((n <= 0)) {
            String nString = JOptionPane.showInputDialog("Skriv inn et heltall over 0");
            n = Integer.parseInt(nString);
        }

        // Prøvde å unngå max value med å bruke long istedenfor int, det har nok fungert, men ikkje til den grad eg håpte
        long fak = 1;
        for(int i = 1; i< n; i++){

            fak = fak*(i+1);
        }

        System.out.println(fak);
    }
}
