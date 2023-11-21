/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author felip
 */
public class Druida extends Personaje {
    
    private String tipo_arma;
    private String tipo_armadura;
    private String rol;
    private String feral;

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

    public String getFeral() {
        return feral;
    }

    public void setFeral(String feral) {
        this.feral = feral;
    }

    public Druida(String tipo_arma, String tipo_armadura, String rol, String feral, int id_personaje, String nombre, int nivel, String raza, String tipo_clase, int vida, int mana, int fuerza, int inteligencia, int agilidad, int armadura) {
        super(id_personaje, nombre, nivel, raza, tipo_clase, vida, mana, fuerza, inteligencia, agilidad, armadura);
        this.tipo_arma = tipo_arma;
        this.tipo_armadura = tipo_armadura;
        this.rol = rol;
        this.feral = feral;
    }

    public Druida(String tipo_arma, String tipo_armadura, String rol, String feral) {
        this.tipo_arma = tipo_arma;
        this.tipo_armadura = tipo_armadura;
        this.rol = rol;
        this.feral = feral;
    }

    public Druida() {
    }

    

   
    
}
