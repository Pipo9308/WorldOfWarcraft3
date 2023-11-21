/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author felip
 */
public class CazadorDemonio {
    
    private String tipo_arma;
    private String tipo_armadura;
    private String rol;
    private String venganza;

    public String getTipo_arma() {
        return tipo_arma;
    }

    public void setTipo_arma(String tipo_arma) {
        this.tipo_arma = tipo_arma;
    }

    public String getTipo_armadura() {
        return tipo_armadura;
    }

    public void setTipo_armadura(String tipo_armadura) {
        this.tipo_armadura = tipo_armadura;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getVenganza() {
        return venganza;
    }

    public void setVenganza(String venganza) {
        this.venganza = venganza;
    }

    public CazadorDemonio(String tipo_arma, String tipo_armadura, String rol, String venganza) {
        this.tipo_arma = tipo_arma;
        this.tipo_armadura = tipo_armadura;
        this.rol = rol;
        this.venganza = venganza;
    }

    public CazadorDemonio() {
    }
    
}
