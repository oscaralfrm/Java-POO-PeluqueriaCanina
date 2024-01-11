package logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Dueno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDueno;
    
   @Basic
    private String nombre;
    private String celular;
    private String direccion;
    
    @OneToMany(mappedBy = "dueno")
    private ArrayList<Mascota> listaMascotas;

    public Dueno() {
    }

    public Dueno(int idDueno, String nombre, String celular, String direccion, ArrayList<Mascota> listaMascotas) {
        this.idDueno = idDueno;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
        this.listaMascotas = listaMascotas;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    @Override
    public String toString() {
        return "Dueno{" + "idDueno=" + idDueno + ", nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + ", listaMascotas=" + listaMascotas + '}';
    }
   
    
    
}
