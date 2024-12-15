/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaCf;

/**
 *
 * @author Dell 5421
 */
public class GestionPaciente {
    private String id;
    private String Nombre; 
    private String Direccion;
    private String Historial;
    private String Enfermedad;

    public GestionPaciente(String id, String Nombre, String Direccion, String Historial, String Enfermedad) {
        this.id = id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Historial = Historial;
        this.Enfermedad = Enfermedad;
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

    public String getHistorial() {
        return Historial;
    }

    public void setHistorial(String Historial) {
        this.Historial = Historial;
    }

    public String getEnfermedad() {
        return Enfermedad;
    }

    public void setEnfermedad(String Enfermedad) {
        this.Enfermedad = Enfermedad;
    }
    
    

    
    
    
}
