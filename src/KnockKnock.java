import javax.swing.JOptionPane;
public class KnockKnock {
public static void main(String[] args) {
String name= JOptionPane.showInputDialog("Enter a name");
String yes1= JOptionPane.showInputDialog( "Will you remember my name in 1 minute");
String yes2= JOptionPane.showInputDialog("Will you remember my name in 1 hour");
String yes3= JOptionPane.showInputDialog("Will you remember my name in 1 month");
String yes4= JOptionPane.showInputDialog("Will you remember my name in 1 year");
String whos_there= JOptionPane.showInputDialog( "Knock, Knock");
JOptionPane.showMessageDialog(null, "You forgot me ALREADY!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\nAHHHHHHHHHHHHHHHHHHHHHHHHHHH I WILL KILL YOU!!!\nThe name was "+name+" by the way.");
}
}