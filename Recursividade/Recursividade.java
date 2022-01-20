
package com.mycompany.loianejavaobjetos;

public class Recursividade {


    public static void main(String[] args) {
        Fatorial calcular = new Fatorial();
        
        System.out.println(calcular.FatorialNaoRecursivo(5));
        
        System.out.println(calcular.FatorialRecursivo(5));
    }
    
}
