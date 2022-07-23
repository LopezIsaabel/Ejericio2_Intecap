/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2_2;

import java.util.Scanner;

/**
 *Pedir un numero e indicar si es positivo o negativo.
 * @author izabe
 */
public class Tarea2_2 {

    public static void main(String[] args) {
    
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sp.nextInt();
        if(num>0){
            System.out.println("El numero es positivo");
        }else if(num<0){
            System.out.println("El numero es negativo");
        }
    }
}
