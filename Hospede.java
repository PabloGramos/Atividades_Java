public class Hospede {
    private String cpf;
    private String nome;
    
    public Hospede(){
    }
    
    public Hospede(String cpf, String nome){
        this.setCPF(cpf);
        this.setNOME(nome);
    }
    
    public String getCPF(){
        return this.cpf;
    }
    public void setCPF(String cpf){
        this.cpf = cpf;
    }
    public String getNOME(){
        return this.nome;
    }
    public void setNOME(String nome){
        this.nome = nome;
    }
    
    
    public void status(){
        System.out.println("\nCliente: " + this.nome + "\nCPF: " + this.cpf);
    }
}
