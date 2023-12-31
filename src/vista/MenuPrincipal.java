
package vista;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import datos.DatosA;
import Controlador.controladorMenu;
import java.awt.EventQueue;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public final class MenuPrincipal extends JFrame {
    
    public JButton Jnuevo,Jconsultar,Jacerca,Jactualiazar,mostrar,Jlistados;
    public ArrayList<DatosA> Datosa = new ArrayList<>();
    
    
    public MenuPrincipal() {
        super("Menu Principal");
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        Guia();
        
    }
    public void Guia() {
        controladorMenu ctm = new controladorMenu(this);
        
        Jnuevo = new JButton("Nuevo");
        Jnuevo.setBounds(250, 120, 200, 40);
        Jnuevo.setMnemonic('I');
        Jnuevo.addActionListener(ctm);
        Jnuevo.setBackground(Color.BLACK);
        Jnuevo.setForeground(Color.WHITE);
        
        add(Jnuevo);
        
        Jconsultar = new JButton("Consultar");
        Jconsultar.setBounds(250, 220, 200, 40);
        Jconsultar.setMnemonic('I');
        Jconsultar.addActionListener(ctm);
        Jconsultar.setBackground(Color.BLACK);
        Jconsultar.setForeground(Color.WHITE);
        add(Jconsultar);
        
        Jactualiazar = new JButton("Actualizar");
        Jactualiazar.setBounds(250, 320, 200, 40);
        Jactualiazar.setMnemonic('I');
        Jactualiazar.addActionListener(ctm);
        Jactualiazar.setBackground(Color.BLACK);
        Jactualiazar.setForeground(Color.WHITE);
        add(Jactualiazar);
        
        Jlistados = new JButton("listados ");
        Jlistados .setBounds(550, 320, 200, 40);
        Jlistados .setMnemonic('I');
        Jlistados .addActionListener(ctm);
        Jlistados .setBackground(Color.BLACK);
        Jlistados .setForeground(Color.WHITE);
        add(Jlistados );
        
        Jacerca = new JButton("Acerca");
        Jacerca.setBounds(250, 420, 200, 40);
        Jacerca.setMnemonic('l');
        Jacerca.addActionListener(ctm);
        Jacerca.setBackground(Color.BLACK);
        Jacerca.setForeground(Color.WHITE);
        add(Jacerca);
        
    }
    
    

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MenuPrincipal frame = new MenuPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
