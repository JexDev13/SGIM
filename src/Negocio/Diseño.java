package Negocio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/*
 * @authors G2 SoftwareSolutions
 */
public class Diseño {
    
    ImageIcon ICONERROR=null;

    public void jComboUsers(JComboBox jCUsers) {
        jCUsers.setBackground(Color.WHITE);
    }

    public void jtableHead(JTable table)
    {
        table.getTableHeader().setBackground(new Color(250,183,22));
        table.getTableHeader().setFont(new Font("Segoe UI Symbol",Font.BOLD,12));
        table.getTableHeader().setForeground(Color.WHITE);
    }
    
    public ImageIcon getICONERROR() {
        ICONERROR=new ImageIcon(Diseño.class.getResource("/Imagenes/warning 128.png"));
        ICONERROR=new ImageIcon(ICONERROR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONERROR;
    }

}
