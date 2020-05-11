/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pablo
 */
public class Calculadora {
    
    public Calculadora(){
        
    }
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }
    
}
