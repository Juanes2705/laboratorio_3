
package vista;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
import Controlador.listadocontrolador;
import java.util.ArrayList;
import javax.swing.JButton;
import datos.DatosA;
import vista.ListadoGeneral;  // Añade esta importación

public class listadoJframe extends JFrame {
    public ArrayList<DatosA> Datosa = new ArrayList<>();

    public ArrayList<DatosA> obtenerDatos() {
        // No es necesario crear una nueva lista Datosa aquí
        for (DatosA a : Datosa) {
            String id = a.getID();
            String info = a.getINfo();
            String ho = a.getHOrario();
            
            // Crea un nuevo objeto DatosA con los datos reales
            DatosA da = new DatosA(id, info, ho, info, info, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled, rootPaneCheckingEnabled);
            Datosa.add(da);
        }
        
        return Datosa;
    }
    
    public JButton ListadoG;
    public MenuPrincipal MP;
    
    public listadoJframe(MenuPrincipal MP){
        super("Menu Principal");
        this.MP = MP;
        setSize(1024, 768);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);
        
        crearGuia();
    }
    
    private void crearGuia(){
        listadocontrolador lcd = new listadocontrolador(this);
        
        ListadoG = new JButton("Nuevo");
        ListadoG.setBounds(250, 120, 200, 40);
        ListadoG.setMnemonic('I');
        ListadoG.addActionListener(lcd);
        ListadoG.setBackground(Color.BLACK);
        ListadoG.setForeground(Color.WHITE);
        
        add(ListadoG);
    }
    
    // Agrega el código para cargar datos en Datosa y crear ListadoGeneral aquí
     }
    

