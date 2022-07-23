/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2_1;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números y que nos diga si son iguales o no.
 * @author izabe
 */
public class Tarea2_1 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = sp.nextInt();
        if(num1==num2){
            System.out.println("Los numeros son iguales");
        }else{
            System.out.println("Los numeros no son iguales");
        }
    }
}
