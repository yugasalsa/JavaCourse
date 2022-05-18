/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.capitulo2teoria;

/**
 *
 * @author yuri
 */
public class Principal {
    
    public static void main (String[] args){
    
    Calculadora micalculadora = new Calculadora();
    
    int valor1= 4;
    int valor2= 3;
            
    System.out.println("La suma es: "+ micalculadora.sumar(valor1, valor2));
     System.out.println("La resta es: "+ micalculadora.restar(valor1, valor2));
      System.out.println("La multiplicacion es: "+ micalculadora.multiplicar(valor1, valor2));
      /* System.out.println("La division es:"+ micalculadora.dividir(valor1, valor2));*/
    }
    
}
