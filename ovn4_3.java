import javax.swing.*;

/* Övning 4.3
David Andersson
25/9 2017 */

public class ovn4_3{
	public static void main(String[] args){
		char a1 = '\u00E5';
		char a2 = '\u00E4';
		char o1 = '\u00F6';

		String betygg = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga po" + a2 + "ng fick du?");
		int betyg = Integer.parseInt(betygg);
		

		if (betyg >=45) {
			JOptionPane.showMessageDialog(null, "Betyg: A");

		} else if (betyg >=40) {
			JOptionPane.showMessageDialog(null, "Betyg: B");

		} else if (betyg >=35) {
			JOptionPane.showMessageDialog(null, "Betyg: C");

		} else if (betyg >=30) {
			JOptionPane.showMessageDialog(null, "Betyg: D");

		} else if (betyg >=25) {
			JOptionPane.showMessageDialog(null, "Betyg: E");

		} else if (betyg <=24) {
			JOptionPane.showMessageDialog(null, "Betyg: F");

		} else {
			JOptionPane.showMessageDialog(null, "Ange en siffra mellan 0 och 50.");
		}
	}
}