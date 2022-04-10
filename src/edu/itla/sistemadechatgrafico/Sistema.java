package edu.itla.sistemadechatgrafico;

import edu.itla.sistemadechatgrafico.iu.Lanzador;
import javax.swing.UIManager;

public class Sistema {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new Lanzador().setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
