package logica;

import java.util.ArrayList;
import persistencia.ControladorPersistencia;

public class Controlador {
    
    // Instanciamos un objeto de clase ControladorPersistencia que maneje todas las peticiones
    
    ControladorPersistencia controlPersist = new ControladorPersistencia();
    
    // Definimos todos los métodos que serán usados...
    
     /*                               MÉTODOS MASCOTA                                        */
    
    public void crearMascota(Mascota mascota) {
        controlPersist.crearMascota(mascota);
    }
    
    public void editarMascota(Mascota mascota) {
        controlPersist.editarMascota(mascota);
    }
    
    public void eliminarMascota(int idMascota) {
        controlPersist.eliminarMascota(idMascota);
    }
    
    public Mascota encontrarMascota(int idMascota) {
      return controlPersist.encontrarMascota(idMascota);
    }
    
    public ArrayList<Mascota> encontrarTodasMascotas() {
       return controlPersist.encontrarTodasMascotas();
    }

    
     /*                               MÉTODOS DUEÑO                                        */
    
    public void crearDueno(Dueno dueno) {
        controlPersist.crearDueno(dueno);
    }
    
    public void editarDueno(Dueno dueno) {
        controlPersist.editarDueno(dueno);
    }
    
    public void eliminarDueno(int idDueno) {
       controlPersist.eliminarDueno(idDueno);
    }
    
    public Dueno encontrarDueno(int idDueno) {
      return controlPersist.encontrarDueno(idDueno);
    }
   
    
    public ArrayList<Dueno> encontrarTodosDuenos() {
      return controlPersist.encontrarTodosDuenos();
    }

    
}
