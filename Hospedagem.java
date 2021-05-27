public class Hospedagem{
    private String apartamento;
    private int qtdDiarias;
    private double valorDiaria;
    private double consumo;
    private Hospede hospede;
    private double total;
    private double servico , soma ;
    
    public Hospedagem(){
        
    }
    public Hospedagem(String apartamento, int qtdDiarias, double valorDiaria, double consumo, Hospede hospede){
        this.setApartamento(apartamento);
        this.setQtdDiarias(qtdDiarias);
        this.setValorDiaria(valorDiaria);
        this.setConsumo(consumo);
        this.setHospedar(hospede);
    }
    
    public void setApartamento(String apartamento){
        this.apartamento = apartamento;
    }
    public String getApartamento(){
        return this.apartamento;
    }
    
    public void setQtdDiarias(int qtdDiarias){
        this.qtdDiarias = qtdDiarias;
    }
    public int getQtdDiarias(){
        return this.qtdDiarias;
    }
    
    public void setValorDiaria(double valorDiaria){
        this.valorDiaria = valorDiaria;
    }
    public double getValorDiaria(){
        return this.valorDiaria;
    }
    
    public void setConsumo(double consumo){
        this.consumo = consumo;
    }
    public double getConsumo(){
        return this.consumo;
    }
    
    public void setHospedar(Hospede hospede){
        this.hospede = hospede;
    }
    public Hospede getHospedar(){
        return this.hospede;
    }
    
    public double getServicos(){
        if(this.qtdDiarias > 3){
            this.soma = this.valorDiaria * 0.10;
            this.servico = this.soma * this.qtdDiarias;
        }
        else{
            this.soma = this.valorDiaria * 0.15;
            this.servico = this.soma * this.qtdDiarias;
        }
        this.total = this.servico + this.consumo + (this.qtdDiarias * this.valorDiaria);
        return this.total;
    }
}




