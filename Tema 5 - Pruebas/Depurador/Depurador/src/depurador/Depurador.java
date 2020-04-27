/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depurador;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Depurador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public static void ej1(){
        //imprimir los n primeros números
        int n=10;
        int i=1;
        System.out.println("Este programa escribe los "+ n +" primeros números");
        while(i<=n){
            System.out.println(i);
            i++;
        }
        
    }
    
    public static void ej2(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Introduce el tamaño del array");
       int tamano=sc.nextInt();
       int[] miArray=new int[tamano];
       encontrarMax(miArray);
       
    }
    
    public static void encontrarMax(int[] array){
        int max=array[1];
        for(int i=1;i<array.length;i++){
            if(array[i]>max) max=array[i];
        }
        System.out.println("El valor máximo es " + max);
    }
    
    public static void ej3(){
        Scanner sc=new Scanner(System.in);
        int num, total = 0, cuantos = 0;
        double media;
        do {
            System.out.print("Introduce un número (0 para acabar): ");
            num = sc.nextInt();
            if (num != 0) {
                total += num;
                cuantos++;
            }
        } while (num != 0);
        media = (double) total / cuantos;
        System.out.println("Total: " + cuantos + " Media: " + media);
    }
    
    public static void ej4(){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce un número entero (de 1 a 9): ");
        num = sc.nextInt();
        if ((num < 1) || (num > 9)) {
            System.out.println("El número no está entre 1 y 9.Terminando el programa...");
        } else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
    
}
