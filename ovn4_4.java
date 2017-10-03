import javax.swing.*;

/* Övning 4.4
David Andersson
*/

public class ovn4_4{
	public static void main(String[] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö

		String langdd = JOptionPane.showInputDialog(null, "Hur l" + a1 + "ngt " + a2 + "r brevet? (mm)");
		double langd = Double.parseDouble(langdd);
		
		String tjocklekk = JOptionPane.showInputDialog(null, "Hur tjockt " + a2 + "r brevet? (mm)");
		double tjocklek = Double.parseDouble(tjocklekk);

		String bred = JOptionPane.showInputDialog(null, "Hur brett " + a2 + "r brevet? (mm)");
		double bredd = Double.parseDouble(bred);





		if (langd >600) {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");

		} else if (langd <140) {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");

		} else if (tjocklek >100) {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");

		} else if (bredd <90) {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");

		} else if (langd + tjocklek + bredd >900) {
			JOptionPane.showMessageDialog(null, "Felaktiga m" + a1 + "tt.");

		} else if (langd + tjocklek + bredd <900) {
			JOptionPane.showMessageDialog(null, "Godk" + a2 + "nda m" + a1 + "tt.");
		}
	}
}