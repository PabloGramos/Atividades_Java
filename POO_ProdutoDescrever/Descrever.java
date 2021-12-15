public class Descrever {
    private int codigo;
    private String descricao;
    
    public Descrever(){
    }
    
    public Descrever(int codigo, String descricao){
        this.setCodigo(codigo);
        this.setDescricao(descricao);
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public int getCodigo(){
        return this.codigo;
    }
    public String getDescricao(){
        return this.descricao;
    }
}
