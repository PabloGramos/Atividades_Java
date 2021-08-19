public class Pedido{
    private MilkShake escolha;
    private int pago;
    private int troco;
    
    public Pedido(){
    }

    public Pedido(MilkShake escolha, int pago){
        this.setEscolha(escolha);
        this.setPago(pago);
    }
    
    public void setEscolha(MilkShake escolha) {
        this.escolha = escolha;
    }
    public MilkShake getEscolha(){
        return escolha;
    }
    public void setPago(int pago) {
        this.pago = pago;
        this.troco = pago - this.escolha.getPreco();
    }
    public float getPago(){
        return this.pago;
    }
    
    
    public float getTroco(){ 
        return this.troco;
    }

    
}