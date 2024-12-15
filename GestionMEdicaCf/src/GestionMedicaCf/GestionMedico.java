/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaCf;

/**
 *
 * @author Dell 5421
 */
public class GestionMedico {
   
    private String id;
    private String Nombre;
    private String Direccion;
    private String Especialidad;
    private String Experiencia;

    public GestionMedico(String id, String Nombre, String Direccion, String Especialidad, String Experiencia) {
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Especialidad = Especialidad;
        this.Experiencia = Experiencia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getExperiencia() {
        return Experiencia;
    }

    public void setExperiencia(String Experiencia) {
        this.Experiencia = Experiencia;
    }
    
    
    
    
    
    
    
   
}

