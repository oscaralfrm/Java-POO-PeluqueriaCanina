package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Dueno;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class ControladorPersistencia {
    
    // Creamos los constructores para cada JPA Controller
    
    MascotaJpaController mascotaJpa = new MascotaJpaController();
    DuenoJpaController duenoJpa = new DuenoJpaController();
    
   /*                               MÉTODOS MASCOTA                                        */
    
    public void crearMascota(Mascota mascota) {
        mascotaJpa.create(mascota);
    }
    
    public void editarMascota(Mascota mascota) {
        try {
            mascotaJpa.edit(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarMascota(int idMascota) {
        try {
            mascotaJpa.destroy(idMascota);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Mascota encontrarMascota(int idMascota) {
        return mascotaJpa.findMascota(idMascota);
    }
    
    public ArrayList<Mascota> encontrarTodasMascotas() {
        
        List<Mascota> listaMascotas =  mascotaJpa.findMascotaEntities();
        ArrayList<Mascota> listaTodasMascotas = new ArrayList<>(listaMascotas);
        return listaTodasMascotas;
        
    }
    
     /*                               MÉTODOS DUEÑO                                        */
    
    public void crearDueno(Dueno dueno) {
        duenoJpa.create(dueno);
    }
    
    public void editarDueno(Dueno dueno) {
        try {
            duenoJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarDueno(int idDueno) {
        try {
            duenoJpa.destroy(idDueno);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Dueno encontrarDueno(int idDueno) {
        return duenoJpa.findDueno(idDueno);
    }
    
    public ArrayList<Dueno> encontrarTodosDuenos() {
        
        List<Dueno> listaDuenos =  duenoJpa.findDuenoEntities();
        ArrayList<Dueno> listaTodosDuenos = new ArrayList<>(listaDuenos);
        return listaTodosDuenos;
        
    }

    // Crear método guardar
    
    public void guardar(Dueno dueno, Mascota mascota) {
        
        duenoJpa.create(dueno);
        mascotaJpa.create(mascota);
        
    }
    
}
