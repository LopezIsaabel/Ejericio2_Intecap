/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tarea2_5;

import java.util.Scanner;

/**
 *
 * @author izabe
 */
public class Tarea2_5 {

    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su dia");
        int dia = sp.nextInt();
        System.out.println("Ingrese su mes");
        int mes = sp.nextInt();
        System.out.println("Ingrese su año");
        int ano = sp.nextInt();

        switch (mes) {
            case 1:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 2:
                if (dia > 0 && dia <= 28) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 3:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 4:
                if (dia > 0 && dia <= 30) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 5:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 6:
                if (dia > 0 && dia <= 30) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 7:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 8:
                if (dia > 0 && dia <= 30) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 9:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 10:
                if (dia > 0 && dia <= 30) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 11:
                if (dia > 0 && dia <= 30) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            case 12:
                if (dia > 0 && dia <= 31) {
                    if (ano > 0) {
                        System.out.println("Dia " + dia + " " + "Mes " + mes + " " + "Año " + ano);
                    }
                } else {
                    System.out.println("Dia ingresado incorrecto");
                }
                break;
            default:
                System.out.println("No es un numero de mes");
                break;
        }
    }
}
