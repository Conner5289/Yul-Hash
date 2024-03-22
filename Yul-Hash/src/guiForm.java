import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class guiForm extends JFrame {
    private JPanel mainPanel;
    private JLabel userTxt;
    private JLabel Output;
    private JLabel key;
    private JTextField keyInput;
    private JTextField hashOutput;
    private JTextField userTxtInput;





    public guiForm(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Yul-Hash");
        setContentPane(mainPanel);

        userTxtInput.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {


            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                hash myHash = new hash();
                String userIn = userTxtInput.getText();
                myHash.hashGen(userIn);
                hashOutput.setText(myHash.hashDisplay());

            }
        });
    }
}