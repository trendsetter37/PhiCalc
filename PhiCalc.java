//phi = 1.618
//phi = (large + small) / large
// or phi = large/large + small/large = 1.618
//we want this to equal 1.618 therfore
//given small
// we have large = small / (1.618 - 1) 
//given large
//we have small = (1.618 - 1) * large


import java.io.*;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;
import java.lang.Integer;
import java.lang.*;


public class PhiCalc{

public static void main(String []args){

//setup variables

boolean contLooping = true;

while (contLooping) {
String dAnswer = JOptionPane.showInputDialog("Which proportion would you like to use as the given value? small or large?");

if (dAnswer.equals("small") || dAnswer.equals("Small")) {

	//int user_value = Integer.parseInt(JOptionPane.showInputDialog("Enter value here"));
	double user_value = Double.parseDouble(JOptionPane.showInputDialog("Enter value here"));
	double	lg_proportion = user_value / (1.618 - 1);

	String dConclusionMessage = "The magnitude of the larger proportion that would adhere to the Phi ratio is: ";
	JOptionPane.showMessageDialog(null, dConclusionMessage + lg_proportion);
	

String quAnswer = JOptionPane.showInputDialog("Would you like to calculate another Phi Ratio?" );
	if (quAnswer.equals("yes") || quAnswer.equals("Yes")) contLooping = true;
  		else {contLooping = false;}
	
	
} else if (dAnswer.equals("large") || dAnswer.equals("Large")) { 
	
	String dMessage2 = "Enter value here";
	//int user_value = Integer.parseInt(JOptionPane.showInputDialog( dMessage2));
	  double user_value = Double.parseDouble(JOptionPane.showInputDialog(dMessage2));
	
	double	sm_proportion = user_value * (1.618-1);

	String dConclusion2 = "The magnitude of the smaller proportion, that would adhere to the Phi ratio, is: ";
	JOptionPane.showMessageDialog(null, dConclusion2 + sm_proportion);
	
String quAnswer = JOptionPane.showInputDialog("Would you like to calculate another Phi Ratio?" );
	if (quAnswer.equals("yes") || quAnswer.equals("Yes")) contLooping = true;
		else {contLooping = false;}	
	
	
	}
   
  else if (!dAnswer.equals("large") && !dAnswer.equals("Large") && !dAnswer.equals("small") && !dAnswer.equals("Small")) {
	JOptionPane.showMessageDialog(null, "Did you enter small or large?");

}
}


}




}


