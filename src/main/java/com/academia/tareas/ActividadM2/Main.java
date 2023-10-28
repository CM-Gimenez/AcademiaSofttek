/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.academia.tareas.ActividadM2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        while (true) {
            System.out.println("Nueva tarea:");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Fecha de vencimiento: ");
            String fechaVencimiento = scanner.next();
            int prioridad;
            
            //
            while (true) {
                try {
                    System.out.print("Prioridad (1-5): ");
                    prioridad = scanner.nextInt();
                    if (prioridad < 1 || prioridad > 5) {
                        throw new InputMismatchException();
                    }
                    break;
                    //exepcion
                } catch (InputMismatchException e) {
                    System.out.println("La prioridad debe estar entre 1 y 5.");
                    scanner.next(); 
                }
            }
            //creamos y guardamos la tarea
            Tarea nuevaTarea = new Tarea(nombre, fechaVencimiento, prioridad);
            //agregamos la tarea creada a la lista de tareas
            listaTareas.add(nuevaTarea);

            System.out.print("¿Desea agregar otra tarea? (S/N): ");
            String respuesta = scanner.next().toUpperCase();
            if (!respuesta.equals("S")) {
                break;
            }
        }

        //Imprimimos el listado de tareas creadas
        System.out.println("Lista de tareas:");
        //mediante un foreach recorremos el listado para obtener los atributos de cada tarea.
        for (Tarea tarea : listaTareas) {
            System.out.println("Nombre: " + tarea.getNombre());
            System.out.println("Fecha de vencimiento: " + tarea.getFechaVencimiento());
            System.out.println("Prioridad: " + tarea.getPrioridad());
            System.out.println();
        }
    }
}
