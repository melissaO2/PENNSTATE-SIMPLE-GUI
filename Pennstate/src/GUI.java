import javax.swing.*;
import java.awt.*;


public class GUI {
    public static void main(String[] agrs){
//Outer panel
        JFrame frame = new JFrame();//creates our frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
     //   frame.setLayout(new GridLayout(4,2,10,10));

//Color




        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4,2,10,10));
        panel.setBounds(250,150,300,200);


        JLabel label = new JLabel("Name");
        JLabel label2 = new JLabel("ID");

        JLabel title = new JLabel("SCHORLASHIP APPLICATION");
        title.setBounds(150,80,300,10);

        JTextField textField = new JTextField();// We want the person to type it in
        JTextField textField2 = new JTextField();

        JButton button = new JButton("SUBMIT"); // a button to click after they are done

// adding it to our frame
        frame.add(title);
        panel.add(label);
        panel.add(textField);
        panel.add(label2);
        panel.add(textField2);
       //panel.add(new JLabel()); // empty space for alignment
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
