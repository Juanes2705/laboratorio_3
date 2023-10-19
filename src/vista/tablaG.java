
package vista;


import javax.swing.table.DefaultTableModel;


public class tablaG extends DefaultTableModel {
    public tablaG(Object datos[][], Object encabezados[]) {
        super(datos, encabezados);
    }
    
    public boolean isCellEditable(int row, int column) {
        // Para permitir la edición de celdas, cambia el return a true
        // return true;
        return false; // Esto evita la edición de celdas, como está actualmente
    }
}
