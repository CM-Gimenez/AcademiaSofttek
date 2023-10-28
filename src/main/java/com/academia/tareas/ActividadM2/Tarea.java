/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.academia.tareas.ActividadM2;

/**
 *
 * @author usuario
 */
public class Tarea {
    
    private String nombre;
    private String fechaVencimiento;
    private int prioridad;

    public Tarea(String nombre, String fechaVencimiento, int prioridad) {
        this.nombre = nombre;
        this.fechaVencimiento = fechaVencimiento;
        this.prioridad = prioridad;
    }

    // Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
    
}
