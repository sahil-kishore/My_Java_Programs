import javax.swing.JOptionPane;

public class JOptionPaneGUI {
    public static void main(String[] args) {
       
        String name = JOptionPane.showInputDialog("Enter your name:"); //getting input

        String ageText = JOptionPane.showInputDialog("Enter your age:");
        int age = Integer.parseInt(ageText);

        JOptionPane.showMessageDialog(null,"Thanks "+ name + " ! Your age is " + age); // showing a message box
    }

}
