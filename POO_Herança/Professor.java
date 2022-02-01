public class Professor extends Pessoa{
    private double salario;
    private String materia;
    
    public Professor(){
    }
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public String getMateria(){
        return this.materia;
    }
    public void setMateria(String materia){
        this.materia = materia;
    }
}