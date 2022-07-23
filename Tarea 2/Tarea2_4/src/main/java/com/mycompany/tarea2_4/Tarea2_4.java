/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2_4;

import java.util.Scanner;

/**
 *Pedir tres números y mostrarlos ordenas de mayor a menor.
 * @author izabe
 */
public class Tarea2_4 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int num1 = sp.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = sp.nextInt();
        System.out.println("Ingrese tercer numero");
        int num3 = sp.nextInt();
        if(num1>num2 && num2> num3){
            System.out.println(num1+" "+ num2+ " "+ num3);
        } else if(num2>num1 && num1>num3){
            System.out.println(num2+" "+ num1+ " "+ num3);
        }else if(num3>num1 && num1>num2){
            System.out.println(num3+" "+ num1+ " "+ num2);
        }else if(num1>num3 && num3> num2){
            System.out.println(num1+" "+ num3+ " "+ num2);
        }else if(num2>num3 && num3> num2){
            System.out.println(num2+" "+ num3+ " "+ num1);
        }else if(num3>num2 && num2> num1){
            System.out.println(num3+" "+ num2+ " "+ num1);
        }
    }
}
