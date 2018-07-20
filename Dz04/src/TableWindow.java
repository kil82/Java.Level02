import javax.swing.*;

public class TableWindow extends JFrame {
    public TableWindow() {
        String[] columnNames = {"Имя", "Возраст", "з/п"};
        Object[][] data = {
                {"Кирилл", 30, 30000},
                {"Петя", 25, 23000},
                {"Вася", 29, 50000}
        };
        setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        setTitle("Additional2");
        setBounds(300, 300, 400, 400);
        JTable tableExample = new JTable(data, columnNames);
        tableExample.setAutoCreateRowSorter(true);
        JScrollPane scrollPane = new JScrollPane(tableExample);
        add(scrollPane);
        setVisible(true);
    }
}
