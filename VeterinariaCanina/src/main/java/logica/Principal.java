package logica;

import interfaz.MenuPrincipal;
import java.util.ArrayList;
import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
 
        MenuPrincipal pantalla = new MenuPrincipal();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        //Controlador controlador = new Controlador();
        
        /*  Creamos algunos objetos de prueba para visualizar en la BBDD */
        
        /* Creamos dos mascotas de prueba */
        /*
        
        Mascota mascota1 = new Mascota(1, "Miau", "Husky Siberiano", 
                "Gris", true, true, "N/A");
        
       Mascota mascota2 = new Mascota(2, "Wau", "Pastor Alemán", 
                "Marrón", false, false, "N/A");
       
       ArrayList<Mascota> mascotasDueno1 = new ArrayList<>(Arrays.asList(mascota1, mascota2));
       
       controlador.crearMascota(mascota1);
       controlador.crearMascota(mascota2);
        
       Dueno dueno1 = new Dueno(1, "Mariano", "Cisterna", "3518785924", mascotasDueno1);
       
       mascota1.setDueno(dueno1);
       mascota2.setDueno(dueno1);
       
       
       
       controlador.crearDueno(dueno1);
       */
    }
}
