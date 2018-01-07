package FrontEnd;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class GUI extends JFrame {
    private JTable table;


    public GUI(String s) throws HeadlessException {
        super(s);
        setSize(new Dimension(400,600));
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JScrollPane scroll = new JScrollPane(createJTable());
        add(scroll, BorderLayout.CENTER);
        scroll.setViewportView(table);
        pack();
        setVisible(true);
    }

    private JTable createJTable() {
        String[] colHeadings = {"Name", "Status", "Result"};
        int numRows = 5;
        DefaultTableModel model = new DefaultTableModel(numRows, colHeadings.length) ;
        model.setColumnIdentifiers(colHeadings);
        table = new JTable(model);
        return table;
    }
}
