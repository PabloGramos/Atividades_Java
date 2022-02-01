public class Alunos extends Pessoa{
    private double nota;
    private String aprovacao;
    
    public Alunos(){
    }
    
    public double getNota(){
        return this.nota;
    }
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public String getAprovacao(){
        return this.aprovacao;
    }
    public void setAprovacao(String aprovacao){
        this.aprovacao = aprovacao;
    }
}