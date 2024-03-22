import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guiForm extends JFrame {
    private JPanel mainPanel;
    private JButton hashButton;
    private JLabel userTxt;
    private JLabel Output;
    private JTextArea inputArea;
    private JLabel key;
    private JTextField keyInput;
    private JTextField hashOutput;
    private JTextField textField1;

    public guiForm(){
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Yul-Hash");
        setContentPane(mainPanel);
        hashButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

}
