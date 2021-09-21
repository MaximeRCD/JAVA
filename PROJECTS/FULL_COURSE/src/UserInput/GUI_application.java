package UserInput;
import javax.swing.JOptionPane;

// See what is javax....
// https://docs.oracle.com/javase/7/docs/api/javax/swing/package-summary.html

public class GUI_application {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name );

        // int age =  JOptionPane.showInputDialog("What is your age"); This is not an int so :
        int age =  Integer.parseInt(JOptionPane.showInputDialog("What is your age"));
        JOptionPane.showMessageDialog(null, "Your are  " + age + " years old." );

        // double height = JOptionPane.showInputDialog("How tall are you ? "); This is not a double so :
        double height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you ? "));
        JOptionPane.showMessageDialog(null, "Your are  " + height + " m tall." );

    }
}
