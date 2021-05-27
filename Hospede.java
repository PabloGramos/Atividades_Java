public class Hospede {
    private String nome;
    private String cpf;
    
    public Hospede() {
    }
    
    public Hospede(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
}