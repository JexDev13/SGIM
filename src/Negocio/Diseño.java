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
    
    public void setPanel(int menu, JPanel panel, JPanel jPanelGeneral, JLabel jLabelTituloPanel) {
        panel.setSize(970, 630);
        panel.setLocation(0, 0);
        jPanelGeneral.removeAll();
        jPanelGeneral.add(panel, BorderLayout.CENTER);
        jPanelGeneral.revalidate();
        jPanelGeneral.repaint();
        String titulo = null;
        switch (menu) {
            case 0:
                //Home
                titulo = "\t HOME";
                break;
            case 1:
                //Profesores
                titulo = "\t PROFESORES";
                break;
            case 2:
                //Estudiantes
                titulo = "\t ESTUDIANTES";
                break;
            case 3:
                //Inventario
                titulo = "\t INVENTARIO";
                break;
            case 4:
                //Pagos
                titulo = "\t PAGOS";
                break;
            case 5:
                //Calendario
                titulo = "\t CALENDARIO";
                break;
            case 6:
                //Gestión del sistema
                titulo = "\t GESTIÓN DEL SISTEMA";
                break;
            case 7:
                //Gestión del sistema
                titulo = "\t ADMINISTRADORES DEL SISTEMA";
                break;
        }
        jLabelTituloPanel.setText(titulo);
    }
}
