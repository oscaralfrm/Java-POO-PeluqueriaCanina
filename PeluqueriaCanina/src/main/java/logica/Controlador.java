
package logica;

import java.util.ArrayList;
import java.util.List;
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

    // Guardar 
    
    public void guardar(String nombreMascota, String razaMascota, String colorMascota, 
            String esAlergicoMascota, String esAtencionEspecialMascota, String observacionesMascota, 
            String nombreDueno, String telefonoDueno) {
        
        
        Dueno dueno = new Dueno();
        dueno.setNombre(nombreDueno);
        dueno.setCelular(telefonoDueno);
        
        Mascota mascota = new Mascota();
        mascota.setNombrePerro(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setAlergico(esAlergicoMascota);
        mascota.setAtencionEspecial(esAtencionEspecialMascota);
        mascota.setObservaciones(observacionesMascota);
        mascota.setDueno(dueno);
        
        controlPersist.guardar(dueno, mascota);
        
        
    }

    public ArrayList <Mascota> traerMascotas() {
        return controlPersist.traerMascotas();
    }

    public void borrarMascota(int numCliente) {
         controlPersist.borrarMascota(numCliente);
    }

    public Mascota buscarMascota(int numCliente) {
        return controlPersist.buscarMascota(numCliente);
    }

    public void borrarDueno(int duenoId) {
        controlPersist.borrarDueno(duenoId);
    }

    public void modificarMascota(Mascota mascota) {
        controlPersist.modificarMascota(mascota);
    }

    // Acá todavía no se llama a la persistencia, a la mascota que tenemos por parámetro 
    // hay que asignarle los nuevos valores 
    public void modificarDatosMascota(Mascota mascota, String nombreMascota, String razaMascota, 
            String colorMascota, String esAlergicoMascota, String esAtencionEspecialMascota, 
            String observacionesMascota, String nombreDueno, String telefonoDueno) {
        
        // Todos los métodos con this. se usan para ser reusados por el controlador
        
        // SETTEANDO VARIABLES DE LA MASCOTA
        
        // Acá hacemos el setteo de los nuevos datos de la mascota - MODIFICAMOS LA MASCOTA
        
        mascota.setNombrePerro(nombreMascota);
        mascota.setRaza(razaMascota);
        mascota.setColor(colorMascota);
        mascota.setAlergico(esAlergicoMascota);
        mascota.setAtencionEspecial(esAtencionEspecialMascota);
        mascota.setObservaciones(observacionesMascota);
        
        // El Dueño no se puede modificar, acá delegamos a la PERSISTENCIA
        
        controlPersist.modificarDatosMascota(mascota);
        
        // SETTEANDO VARIABLES DEL DUEÑO
        
        // Identificamos al Dueño
        
        Dueno dueno = this.buscarDueno(mascota.getDueno().getIdDueno());
        
        // Setteamos al dueño con sus valores nuevos
        
        dueno.setNombre(nombreDueno);
        dueno.setCelular(telefonoDueno);
        
        // Llamamos al modificador del dueño
        
        this.modificarDatosDueno(dueno);
        
    }

    private Dueno buscarDueno(int idDueno) {
        return controlPersist.buscarDueno(idDueno);
    }

    private void modificarDatosDueno(Dueno dueno) {
        controlPersist.modificarDatosDueno(dueno);
    }


}
