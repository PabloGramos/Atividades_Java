class Elevador{
    private int pessoas, capMx, andar, terreo;
    
    public Elevador(){
        
    }

    public void setcapacidade(int newValue){
        this.capMx = newValue;
    }
    public void setqtdP(int newValue){
        this.pessoas = newValue;
    }
    public void setandares(int newValue){
        this.andar = newValue;
    }
    public void setsobe(int newValue){
        if((this.terreo + 1) > this.andar){
            System.out.println("Limite alcançado! ");
        }
        else{
            this.terreo = this.terreo + 1;
        }
    }
    public void setdesce(int newValue){
        if((this.terreo - 1) < 0){
            System.out.println("Já chegou ao terreo! ");
        }
        else{
            this.terreo = this.terreo - 1;
        }
    }
    
    
    public void setentra(int increment){
        if((this.pessoas + increment) > this.capMx){
            System.out.println("Capacidade maxima alcançada!");
        }
        else{
            this.pessoas = this.pessoas + increment;
        }
    }
    public void setsai(int decrement){
        if((this.pessoas - decrement) < 0){
            System.out.println("Restam apenas " + this.pessoas + " pessoas para descer!");
        }
        else{
           this.pessoas = this.pessoas - decrement; 
        }
    }
    public int getterreo(){
        return this.terreo;
    }
    public int getpessoas(){
        return this.pessoas;
    }
    
}