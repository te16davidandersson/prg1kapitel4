import javax.swing.*;

/* Övning 4.2
David Andersson
25/9 2017 */

public class ovn4_2{
	public static void main(String[] args){

		String antall = JOptionPane.showInputDialog(null, "Hur manga ganger i veckan ska du ga pa gymmet?");
		double antal = Double.parseDouble(antall);
		double yearantal = antal * 52;
		String arskortspriss = JOptionPane.showInputDialog(null, "Hur mycket kostar ett arskort? (kr)");
		double arskortspris = Double.parseDouble(arskortspriss);
		
		String biljettpriss = JOptionPane.showInputDialog(null, "Hur mycket kostar en biljett? (kr)");
		double biljettpris = Double.parseDouble(biljettpriss);

		double yearbiljettpris = biljettpris * antal * 52;
		if (arskortspris < yearbiljettpris){ JOptionPane.showMessageDialog(null, "Du bor kopa biljett varje gang du far dit");
			}
			else{
				JOptionPane.showMessageDialog(null, "Du bor kopa arskort");
			}
	}
}