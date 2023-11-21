/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author felip
 */
public class Personaje {
    
    private int id_personaje;
    private String nombre;
    private int nivel;
    private String raza;
    private String tipo_clase;
    private int vida;
    private int mana;
    private int fuerza;
    private int inteligencia;
    private int agilidad;
    private int armadura;

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipo_clase() {
        return tipo_clase;
    }

    public void setTipo_clase(String tipo_clase) {
        this.tipo_clase = tipo_clase;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public void setAgilidad(int agilidad) {
        this.agilidad = agilidad;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public Personaje(int id_personaje, String nombre, int nivel, String raza, String tipo_clase, int vida, int mana, int fuerza, int inteligencia, int agilidad, int armadura) {
        this.id_personaje = id_personaje;
        this.nombre = nombre;
        this.nivel = nivel;
        this.raza = raza;
        this.tipo_clase = tipo_clase;
        this.vida = vida;
        this.mana = mana;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
        this.agilidad = agilidad;
        this.armadura = armadura;
    }

    public Personaje() {
    }

    
    
}
