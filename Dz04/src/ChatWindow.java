
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {
    public ChatWindow() {
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("chatWindow");
        setBounds(300, 300, 400, 400);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JButton sendButton = new JButton("Send");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        JTextField textField = new JTextField();

        textArea.setEditable(false);
        bottomPanel.setPreferredSize(new Dimension(400, 40));
        textField.setPreferredSize(new Dimension(300,28));
        bottomPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new BorderLayout());

        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
                textField.setText("");
                textField.grabFocus();
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
                textField.setText("");
                textField.grabFocus();
            }
        });

        bottomPanel.add(textField);
        bottomPanel.add(sendButton);
        centerPanel.add(scrollPane);

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        textField.grabFocus();



        setVisible(true);
    }

}
