import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondWindow extends JFrame {
    private TextTwoWindow parent;
    public SecondWindow(TextTwoWindow parent) {
        this.parent = parent;
        JTextField snameTextField = new JTextField("Фамилия:");
        JTextField fnameTextField = new JTextField("Имя:");
        JTextField tnameTextField = new JTextField("Отчество:");
        JPanel textPanel = new JPanel();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("Enter data");
        setBounds(300, 300, 400, 400);

        JButton newWindowButton = new JButton("Close&Save");


        textPanel.setPreferredSize(new Dimension(400, 350));
        snameTextField.setPreferredSize(new Dimension(370, 58));
        fnameTextField.setPreferredSize(new Dimension(370, 58));
        tnameTextField.setPreferredSize(new Dimension(370, 58));

        newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondWindow.this.parent.setSname(snameTextField.getText());
                SecondWindow.this.parent.setFname(fnameTextField.getText());
                SecondWindow.this.parent.setTname(tnameTextField.getText());
                dispose();
            }
        });

        textPanel.add(snameTextField, BorderLayout.NORTH);
        textPanel.add(fnameTextField, BorderLayout.AFTER_LAST_LINE);
        textPanel.add(tnameTextField, BorderLayout.AFTER_LAST_LINE);

        add(textPanel, BorderLayout.CENTER);
        add(newWindowButton, BorderLayout.SOUTH);
        setVisible(true);
    }

}
