package Negocio;

import javax.swing.ImageIcon;

/*
 * @author JEREMY
 */
public class Imagenes {
    
    ImageIcon ICONERROR=null;
    
    public ImageIcon getICONERROR() {
        ICONERROR=new ImageIcon(Imagenes.class.getResource("/Imagenes/warning 128.png"));
        ICONERROR=new ImageIcon(ICONERROR.getImage().getScaledInstance(128, -1, java.awt.Image.SCALE_DEFAULT));
        return ICONERROR;
    }
    
}