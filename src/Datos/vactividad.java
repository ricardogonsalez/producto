/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Datos;

/**
 *
 * @author Ismael
 */

public class vactividad {
    private int idactividad;
    private String tipo;
    private String titulo;
    private String lugar;        
    private String duracion;

    public vactividad(int idactividad, String tipo, String titulo, String lugar, String duracion) {
        this.idactividad = idactividad;
        this.tipo = tipo;
        this.titulo = titulo;
        this.lugar = lugar;
        this.duracion = duracion;
    }

    public vactividad() {
    }

    
    public int getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(int idactividad) {
        this.idactividad = idactividad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
