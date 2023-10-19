
package vista;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.border.EtchedBorder;
import datos.DatosA;


public class ListadoGeneral extends JFrame{
    
    tablaG mtg;
    JTable tabla;
    MenuPrincipal mp;
    public listadoJframe L;
    
    public ListadoGeneral(listadoJframe L) {
        super("Ingresar");
        this.L = L;
        setSize(500, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        getContentPane().setBackground(Color.GRAY);
        setLayout(null);

        crearGUI();

        // Llena la tabla con los datos reales de listadoJframe
        llenarTabla();

        setVisible(true);
    }
    
    private void crearGUI(){
        JLabel jl = new JLabel("DATOS");
        jl.setBounds(0, 0, 500, 50);
        jl.setBorder(new EtchedBorder());
        jl.setOpaque(true);
        jl.setBackground(new Color(0x191919));
        jl.setForeground(Color.WHITE);
        jl.setFont(new Font("Tahoma", Font.BOLD, 30));
        add(jl);
        
        String encabezados[] = {"ID", "Información", "Horario"};
        Object datos[][] = {{"", "", ""}};

        
        mtg = new tablaG(datos, encabezados);
        tabla = new JTable(mtg);
        
        tabla.setSelectionBackground(Color.lightGray);
        tabla.setSelectionForeground(Color.RED);
       
        JScrollPane js = new JScrollPane(tabla);
        js.setBounds(20, 60, 450, 150);
        
        add(js);
    
    }
    public void llenarTabla() {
    if (L.Datosa != null && !L.Datosa.isEmpty()) {
        // La lista no es nula y tiene elementos, ahora puedes llenar la tabla
        mtg.setRowCount(0);

        // Obtén la lista de datos combinados
        ArrayList<DatosA> datosa = L.obtenerDatos();

        for (DatosA p : datosa) {
            Object datos[] = new Object[5];

            datos[0] = p.getID();
            datos[1] = p.getINfo();
            datos[2] = p.getHOrario();

            mtg.addRow(datos);
        }

        repaint();
    }
}
}

