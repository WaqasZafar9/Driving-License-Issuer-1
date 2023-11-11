import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Dropdown Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();

            // Create a JComboBox with items
            String[] items = {"Option 1", "Option 2", "Option 3"};
            JComboBox<String> comboBox = new JComboBox<>(items);

            // Add an ActionListener to handle item selection
            comboBox.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    // Handle item selection
                    String selectedOption = (String) comboBox.getSelectedItem();
                    JOptionPane.showMessageDialog(frame, "Selected: " + selectedOption);
                }
            });

            panel.add(comboBox);

            frame.getContentPane().add(panel);
            frame.setSize(300, 200);
            frame.setVisible(true);
        });
    }
}
