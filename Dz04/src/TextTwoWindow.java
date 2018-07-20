import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextTwoWindow extends JFrame {
    private JTextField snameTextField;
    private JTextField fnameTextField;
    private JTextField tnameTextField;

    public TextTwoWindow() {

        snameTextField = new JTextField("Фамилия:");
        fnameTextField = new JTextField("Имя:");
        tnameTextField = new JTextField("Отчество:");
        JPanel textPanel = new JPanel();

        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("Additional1");
        setBounds(300, 300, 400, 400);

        JButton newWindowButton = new JButton("new window");


        textPanel.setPreferredSize(new Dimension(400, 350));
        snameTextField.setPreferredSize(new Dimension(370, 58));
        snameTextField.setEditable(false);
        fnameTextField.setPreferredSize(new Dimension(370, 58));
        fnameTextField.setEditable(false);
        tnameTextField.setPreferredSize(new Dimension(370, 58));
        tnameTextField.setEditable(false);

        newWindowButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SecondWindow(TextTwoWindow.this);
            }
        });

        textPanel.add(snameTextField, BorderLayout.NORTH);
        textPanel.add(fnameTextField, BorderLayout.AFTER_LAST_LINE);
        textPanel.add(tnameTextField, BorderLayout.AFTER_LAST_LINE);

        add(textPanel, BorderLayout.CENTER);
        add(newWindowButton, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void setSname(String sname) {
        this.snameTextField.setText(sname);
    }
    public void setFname(String fname) {
        this.fnameTextField.setText(fname);
    }
    public void setTname(String tname) {
        this.tnameTextField.setText(tname);
    }
}
