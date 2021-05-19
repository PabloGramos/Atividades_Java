public class MilkShake{
    private String sabor;
    private String tamanho;
    private int preco;
    
    public MilkShake(){
        
    }
    
    public MilkShake(int sabor, int preco){
        this.setSabor(sabor);
        this.setTamanho(preco);
    }
    
    public String getSabor(){
        return this.sabor;
    }
    
    public void setSabor(int sabor){
        if(sabor == 1)
            this.sabor = "Chocolate";
        if(sabor == 2)
            this.sabor = "Morango";
        if(sabor == 3)
            this.sabor = "Flocos";
        if(sabor == 4)
            this.sabor = "Ovomaltine";
    }
    
    public String getTamanho(){
        return this.tamanho;
    }
    public int getPreco(){
        return this.preco;
    }
    public void setTamanho(int tamanho){
        if(tamanho == 1){
            this.tamanho = "Grande";
            this.preco = 12;
        }
        if(tamanho == 2){
            this.tamanho = "Médio";
            this.preco = 9;
        }
        if(tamanho == 3){
            this.tamanho = "Pequeno";
            this.preco = 7;
        }
    }
}