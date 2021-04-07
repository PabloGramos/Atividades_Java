class Elevador{
    int pessoas = 0, capMx=0, andar=0, terreo=0;
    
    void capacidade(int newValue){
        capMx = newValue;
    }
    void qtdP(int newValue){
        pessoas = newValue;
    }
    void andares(int newValue){
        andar = newValue;
    }
    void sobe(int newValue){
        if((terreo + 1) > andar){
            System.out.println("Limite alcançado! ");
        }
        else{
            terreo = terreo + 1;
        }
    }
    void desce(int newValue){
        if((terreo - 1) < 0){
            System.out.println("Já chegou ao terreo! ");
        }
        else{
            terreo = terreo - 1;
        }
    }
    
    
    void entra(int increment){
        if((pessoas + increment) > capMx){
            System.out.println("Capacidade maxima alcançada!");
        }
        else{
            pessoas = pessoas + increment;
        }
    }
    void sai(int decrement){
        if((pessoas - decrement) < 0){
            System.out.println("Restam apenas " + pessoas + " pessoas para descer!");
        }
        else{
           pessoas = pessoas - decrement; 
        }
    }
    
    void imprime_status(){
        System.out.println("\n============Elevador============");
        System.out.println("Andar| " + terreo + " |  Nº de Pessoas | " + pessoas + " |");
        System.out.println("================================");
    }
    
}