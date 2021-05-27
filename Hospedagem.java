public class Hospedagem {
    private String apartamento;
    private int qtdDiarias;
    private double valorDiaria;
    private double consumo;
    private Hospede hospede;
    
    public Hospedagem() {
    }
    
    public Hospedagem(String apartamento,int qtdDiarias,double valorDiaria,double consumo,Hospede hospede) {
        this.setApartamento(apartamento);
        this.setQtdDiarias(qtdDiarias);
        this.setValorDiaria(valorDiaria);
        this.setConsumo(consumo);
        this.setHospedar(hospede);
    }
    
    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }
    public String getApartamento() {
        return this.apartamento;
    }
    public void setQtdDiarias(int qtdDiarias) {
        this.qtdDiarias = qtdDiarias;
    }
    public int getQtdDiarias() {
        return this.qtdDiarias;
    }
    
    public void setValorDiaria(Double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public Double getValorDiaria() {
        return this.valorDiaria;
    }
    public void setConsumo(Double consumo) {
        this.consumo = consumo;
    }
    public Double getConsumo() {
        return this.consumo;
    }
    public void setHospedar(Hospede hospede) {
        this.hospede = hospede;
    }    
    public Hospede getHospedar() {
        return this.hospede;
    }

}