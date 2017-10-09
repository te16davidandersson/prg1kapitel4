import javax.swing.*;

/* Övning 4.5
David Andersson
*/

public class ovn4_5{
	public static void main(String[] args){
		char a1 = '\u00E5'; //å
		char a2 = '\u00E4'; //ä
		char o1 = '\u00F6'; //ö
		char a3 = '\u00C5'; //Å
		char a4 = '\u00C4'; //Ä
		char o2 = '\u00D6'; //Ö

		String minutt = JOptionPane.showInputDialog(null,"Hur m" + a1 + "nga minuter p" + a1 + "gick samtalet?");
		double minut = Double.parseDouble(minutt);
		int cost = 0;
		String dagtid = JOptionPane.showInputDialog(null, a4 + "ger samtalet rum under dagtid?");

		if (dagtid.equalsIgnoreCase("ja")) {
			minut = minut * 2.5 + 0.6 + 0.5;
			cost = (int) minut;			
		} else if (dagtid.equalsIgnoreCase("nej")) {
			minut = minut * 0.55 + 0.6 + 0.5;
			cost = (int) minut;
		}
		JOptionPane.showMessageDialog(null,"Kostnad: " + cost + "kr");
	}
}