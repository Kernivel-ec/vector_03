/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.kernivel.vector_03;
//Importamos libreria para lectura de datos por teclado
import java.util.Scanner;

/**
 *
 * @author Roberto Calero
 */
    /*
    Realice un programa que solicite 10 nombres ingresados por teclado y que
    almacene la longitud de estos nombres en un vector de tipo entero.
    */
public class Vector_03 {

    public static void main(String[] args) {
        //Creamos una variable de lectura de datos por teclado
        Scanner temp = new Scanner(System.in);
        //Creamos el vector tipo entero donde se almacenaran las longitudes de las palabras
        //La longitud/tamaño/cantidad del vector sera de 10
        int longitudes [] = new int [10];
        //Creamos un ciclo for que recorra las posiciones del vector
        for(int x = 0 ; x < 10 ; x++){
           //Creamos la variable nombre donde se almacenara los datos ingresados por teclado
           System.out.println("Ingrese el nombre: ");
           String nombre = temp.nextLine();
           //Guardamos en el vector longitudes en la posicion x la longitud del nombre
           //length() nos devuelve la longitud de la variable
           longitudes [x] = nombre.length();
        }
        //Imprimimos el vector longitudes
        System.out.println("Longitudes: ");
        for(int x = 0 ; x < 10 ; x++){
           System.out.println(longitudes [x]);
        }
        
    }
}
