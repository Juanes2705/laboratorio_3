
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.Administrador;
import vista.listadoJframe;
import vista.ListadoGeneral;


public class listadocontrolador implements ActionListener {
    listadoJframe L;
    
    public listadocontrolador(listadoJframe L){
        this.L=L;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(L.ListadoG)) {
            ListadoGeneral f = new ListadoGeneral(L);

            L.setVisible(false);
        }
    }
}
