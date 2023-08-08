package Negocio;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTable;

/*
 * @authors G2 SoftwareSolutions
 */
public class Diseño {

    public void jComboUsers(JComboBox jCUsers) {
        jCUsers.setBackground(Color.WHITE);
    }

    public void jtableHead(JTable table)
    {
        table.getTableHeader().setBackground(new Color(250,183,22));
        table.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        table.getTableHeader().setForeground(Color.WHITE);
    }
    
    
}
