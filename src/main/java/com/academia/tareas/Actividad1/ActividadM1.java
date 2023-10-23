package com.academia.tareas.Actividad1;

/**
 * Actividad numero 1: Aplicacion que toma el valor numerico de dos variables y
 * calcula la suma.
 *
 * @author Gimenez Carlos Martin.
 */
public class ActividadM1 {

    //declaracion de variables y le asignamos valores aleatorios mediante la funcion random()
    int numeroUno = (int) (Math.random() * 1000);

    int numeroDos = (int) (Math.random() * 1000);

    int resultado;

    //funcion que suma dos numeros aleatorios
    public void suma() {
        //imprimimos los valores generados 
        System.out.println("Numero 1: " + numeroUno);
        System.out.println("Numero 2: " + numeroDos);

        //asignamos el valor de la suma a la variable resultado
        resultado = numeroUno + numeroDos;
        
        //imprimimos el valor de la suma
        System.out.println("La suma de ambos numeros es: " + resultado);

    }

}
