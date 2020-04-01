/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class CajaBlanca {
    
    
    
    public static void main(String[] args) {
       
            
    }
    
    public static void ej1(int a, int b, int c){
        int x=5;
        if ((a>1) && (b>5) && (c<2))
            x=x+1;
        else
            x= x-1;
        System.out.println(x);
    }
    
     public static void ej2(int a, int b, int c){
        int x=5;
        if ((a>1) || (b>5) || (c<2))
            x=x+1;
        else
            x= x-1;
        System.out.println(x);
    }
     
    public static void ej3(int n){
        //imprime los n primeros numeros
        int i=1;
        while(i<=n){
            System.out.println(i); 
            i++;            
        }
    } 
     
    public static void ej4(int edad){
        if(edad<16){
            System.out.println("Eres demasiado pequeño para conducir y beber");
        }
        else if(edad<21){
            System.out.println("Puedes conducir pero no beber");
        }
        else{
            System.out.println("Puedes conducir y beber");
        }

    }
     
    public static void ej5(int x, int y){
        //metodo para calcular el maximo comun divisor
        while(x!=y){
            if (x>y){
                x=x-y;
            }
            else{
                y=y-x;
            }
        }
        System.out.println(x);
    }
    
    public static void ej6(int x, int y){
        Scanner sc=new Scanner(System.in);
        int num;
        if(x<y){
            System.out.println("Escribe un numero");
            num=sc.nextInt();
            if(x<=num && num<=y){
                System.out.println("Numero dentro del rango");
            }
            else
                System.out.println("Numero fuera de rango");
        }
        else
            System.out.println("Rango invalido");
        
        
    }
    
    public static void ej7(int x, int y){
        Scanner sc=new Scanner(System.in);
        int num=-1;
        if(x<y){
            while(num!=0){
                System.out.println("Escribe un numero. 0 Para salir");
                num=sc.nextInt();
                if(x<=num && num<=y){
                   System.out.println("Numero dentro del rango");
                }
                else
                    System.out.println("Numero fuera de rango");
            }
        }
        else
            System.out.println("Rango invalido");
        
        System.out.println("Programa terminado");
        sc.close();
    }
}
