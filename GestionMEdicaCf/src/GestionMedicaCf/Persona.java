/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GestionMedicaCf;

/**
 *
 * @author carlos funes 
 */
public class Persona {
    private String nombreCF;
    private int edadCF;
    private String direccionCF;

    public Persona(String nombreCF, int edadCF, String direccionCF) {
        this.nombreCF = nombreCF;
        this.edadCF = edadCF;
        this.direccionCF = direccionCF;
    }

    public String getNombreCF() {
        return nombreCF;
    }

    public void setNombreCF(String nombreCF) {
        this.nombreCF = nombreCF;
    }

    public int getEdadCF() {
        return edadCF;
    }

    public void setEdadCF(int edadCF) {
        this.edadCF = edadCF;
    }

    public String getDireccionCF() {
        return direccionCF;
    }

    public void setDireccionCF(String direccionCF) {
        this.direccionCF = direccionCF;
    }

    

}