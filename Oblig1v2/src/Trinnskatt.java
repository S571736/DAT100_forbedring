import javax.swing.*;

public class Trinnskatt {
    public static void main(String[] args) {
        String bruttoInntekt = JOptionPane.showInputDialog("Hva er din bruttoinntekt?");
        double brutto = Double.parseDouble(bruttoInntekt);

        if (brutto <= 164100) {
            System.out.println("Din trinnskatt er 0%. " + "Du betaler dermed ingenting i skatt");
        } else if (brutto <= 230950) {
            System.out.println("Din trinnskatt er 0,93%. " + "Din skatt er dermed: " + brutto * 0.0093);
        } else if (brutto <= 580650) {
            System.out.println("Din trinnskatt er 2,41%. " + "Din skatt er dermed: " + brutto * 0.0241);
        } else if (brutto <= 934050) {
            System.out.println("Din trinnskatt er 11,52%. " + "Din skatt er dermed: " + brutto * 0.1152);
        } else {
            System.out.println("Din trinnskatt er 14,52%. " + "Din skatt er dermed: " + brutto * 0.1452);
        }

    }
}
