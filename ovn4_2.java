import javax.swing.*;

/* Övning 4.2
David Andersson
25/9 2017 */

public class ovn4_2{
	public static void main(String[] args){
		char a1 = '\u00E5';
		char a2 = '\u00E4';
		char o1 = '\u00F6';

		String antall = JOptionPane.showInputDialog(null, "Hur m" + a1 + "nga g" + a1 + "nger i veckan ska du g" + a1 + " till gymmet?");
		double antal = Double.parseDouble(antall);
		double yearantal = antal * 52;
		String arskortspriss = JOptionPane.showInputDialog(null, "Hur mycket kostar ett " + a1 + "rskort? (kr)");
		double arskortspris = Double.parseDouble(arskortspriss);
		
		String biljettpriss = JOptionPane.showInputDialog(null, "Hur mycket kostar en biljett? (kr)");
		double biljettpris = Double.parseDouble(biljettpriss);

		double yearbiljettpris = biljettpris * antal * 52;
		if (arskortspris < yearbiljettpris){ JOptionPane.showMessageDialog(null, "Du b" + o1 + "r k" + o1 + "pa biljett varje g" + a1 + "ng du far dit");
			}
			else{
				JOptionPane.showMessageDialog(null, "Du b" + o1 + "r k" + o1 + "pa " + a1 + "rskort");
			}
	}
}