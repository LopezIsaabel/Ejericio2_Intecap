/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2_3;

import java.util.Scanner;

/**
 *Pedir dos números y mostrarlos ordenados de mayor a menor
 * @author izabe
 */
public class Tarea2_3 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = sp.nextInt();
        
        if(num1>num2){
            System.out.println(num1+" y "+num2);
        }else if(num2>num1){
            System.out.println(num2+" y "+num1);
        }
    }
}
