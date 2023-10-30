
package com.academia.tareas.ActividadM3;

/**
 *
 * @author Gimenez carlos Martin
 */
public class Tarea {
    //Atributos de la clase tarea
    String nombre;
    String fechaDeVencimiento;
    String prioridad;
    
    //Constructor sin atributos
    public Tarea() {
    }

    //Constructor con atributos
    public Tarea(String nombre, String fechaDeVencimiento, String prioridad) {
        this.nombre = nombre;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.prioridad = prioridad;
    }
    
    
    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(String fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
    
    
    
}
