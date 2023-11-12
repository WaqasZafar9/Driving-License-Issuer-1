import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import driverForm.DrivingInfo;

class Login{

    JFrame mainFrame;
    JPanel innerPanel;
    JLabel heading;
    JLabel userNameLabel;
    JTextField userName;
    JLabel passwordLabel;
    JPasswordField password;
    JButton LogIN;

    public Login(){

        initGUI();

        addListner();
    }

    void initGUI(){

        mainFrame=new JFrame();

        innerPanel=new JPanel(new GridLayout(4,2));

        heading=new JLabel("User LogIN");
        innerPanel.add(heading);
        innerPanel.add(new JLabel());

        userNameLabel=new JLabel("User Name : ");
        innerPanel.add(userNameLabel);

        userName=new JTextField();
        innerPanel.add(userName);

        passwordLabel=new JLabel("Password");
        innerPanel.add(passwordLabel);

        password=new JPasswordField();
        innerPanel.add(password);

        LogIN=new JButton("LOGIN");
        innerPanel.add(LogIN);

        mainFrame.add(innerPanel);
        mainFrame.setVisible(true);
        mainFrame.setSize(720,600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void addListner(){

        LogIN.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String user="Fuzail",pswd="123";
                String enteredPassword = String.valueOf( password.getPassword());

                if(userName.getText().equals(user) && enteredPassword.equals(pswd)){

                        JOptionPane.showMessageDialog(null, "User Login SuccessFully");
                        mainFrame.dispose();
                        new DrivingInfo();


                }
                else {
                    JOptionPane.showMessageDialog(null, "User Login Failed");
                }
            }
        });

    }

}




public class AdminLogin {
    public static void main(String[] args) {
        Login user=new Login();
    }
}
