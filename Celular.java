public class Celular {
    private String power;
    private int carga;
    private int armazenamento = 400;
    
    public Celular(){
        
    }

    public void setestado_power(int newValue) {
        if(newValue == 0)
            this.power = "Ligado";
        else{
            this.power = "Desligado";
            System.out.println("Celular est� desligado e n�o tem como utilizar.");
            System.exit(0);
        }
    }
    public String getestado_power(){
        return this.power;
    }
    
    
    public void setcarga_atual(int newValue) {
        this.carga = newValue;
    }
    public int getcarga_atual(){
        return this.carga;
    }
    
    
    public void setmudar_carga(int increment) {
        if(increment == 0)
            this.carga = 100;
    }
    public int getmudar_carga(){
        return this.carga;
    }
    
    
    public void setbaixar_app(int increment) {
        this.armazenamento = this.armazenamento + increment;
    }
    public int getbaixar_app(){
        return this.armazenamento;
    }
    
    
    public void setusar_app(int decrement) {
        this.carga = this.carga - (decrement * 2);
    }
    public int getusar_app(){
        return this.carga;
    }
    
    
    public void setarmazenamento_atual(int newValue) {
        this.armazenamento = newValue;
    }
    public int getarmazenamento_atual(){
        return this.armazenamento;
    }
}