package com.academia.tareas.Actividad1;

import java.util.Scanner;

/**
 * Actividad numero 1: Aplicacion que toma el valor numerico de dos variables,
 * calcula la suma e imprime el resultado´por consola.
 *
 * @author Gimenez Carlos Martin.
 */
public class ActividadM1 {
    
    //declaramos e inicializamos una variable Scanner para leer los números a sumar
    Scanner scann =  new Scanner(System.in);

    //declaracion de variables
    int numeroUno;
    int numeroDos;
    
    //variable para guardar el resultado
    int resultado;
    
    
   

    //funcion que suma dos numeros aleatorios
    public void suma() {
        //le pedimos al usuario que ingrese los numeros a sumar
        System.out.println("Ingrese el primer número: ");
        numeroUno = scann.nextInt();
        System.out.println("Ingrese el segundo número: ");
        numeroDos = scann.nextInt();

        //asignamos el valor de la suma a la variable resultado
        resultado = numeroUno + numeroDos;
        
        //imprimimos por consola el valor de la suma 
        System.out.println("La suma de ambos numeros es: " + resultado);

    }

}
