package co.edu.udec.poo;

import co.edu.udec.poo.gui.VentanaPrincipal;

public class Principal {

    public static void main(String[] args) {
        
        VentanaPrincipal ventana = new VentanaPrincipal();
        ventana.setExtendedState(VentanaPrincipal.MAXIMIZED_BOTH);
        ventana.setVisible(true);
    }
    
}
