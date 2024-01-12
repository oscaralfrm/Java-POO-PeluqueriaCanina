package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dueno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDueno;
    
    @Basic
    private String nombre;
    private String celular;
    

    public Dueno() {
    }

    public Dueno(int idDueno, String nombre, String celular) {
        this.idDueno = idDueno;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Dueno{" + "idDueno=" + idDueno + ", nombre=" + nombre + ", celular=" + celular + '}';
    }

    
}
