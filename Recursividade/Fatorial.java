
package com.mycompany.loianejavaobjetos;


public class Fatorial {
    
    public int FatorialNaoRecursivo(int num){
        int total = 1;
        for(int i=num; i>1; i--){
            total *= i;
            
        }
        return total;
    }
    
    public int FatorialRecursivo(int num){
        if (num == 0){
            return 1;
        }
        return num * FatorialRecursivo(num - 1);
    }
}
