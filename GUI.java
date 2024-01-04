import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private int clickCount = 0; // Track the number of clicks
    private JLabel label; // Declare the label globally to access it in actionPerformed

    public GUI() {
        JFrame frame = new JFrame();

        JButton button = new JButton("Click me");
        button.addActionListener(this); // Adding ActionListener to the button

        label = new JLabel("Number of clicks: 0");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Shivangi's GUI");
        frame.pack();
        frame.setVisible(true);
    }

    // Implementing ActionListener method
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click me")) {
            clickCount++;
            label.setText("Number of clicks: " + clickCount);
        }
    }

    public static void main(String[] args) {
        new GUI(); // Create an instance of the GUI class to launch the application
    }
}
