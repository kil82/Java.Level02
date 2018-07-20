import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    public MainWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 200, 300, 300);
        JButton chatButton = new JButton("Start Chat");
        JButton dopButton1 = new JButton("Additional 1");
        JButton dopButton2 = new JButton("Additional 2");

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        chatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ChatWindow();
            }
        });

        dopButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TextTwoWindow();
            }
        });

        dopButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TableWindow();
            }
        });

        add(chatButton);
        add(dopButton1);
        add(dopButton2);
        setVisible(true);
    }
}
