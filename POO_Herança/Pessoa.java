public class Pessoa{
    private String nome;
    private String identidade;
    
    public Pessoa(){
    }
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getIdentidade(){
        return this.identidade;
    }
    public void setIdentidade(String identidade){
        this.identidade = identidade;
    }
}