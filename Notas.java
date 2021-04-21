public class Notas{
    private String nome, alunos_resultado[][] = new String[100][2];
    private float Array_notas[][]= new float[100][3], nota1, nota2,media;
    private int indicador, j=0;
    
    public Notas(){
        
    }
    
    public void setnome(String newValue , int i){
        this.alunos_resultado[i][0] = newValue;
    }
    public void setnota1(float newValue , int i){
        this.Array_notas[i][0] = newValue;
    }
    public void setnota2(float newValue , int i){
        this.Array_notas[i][1] = newValue;
    }
    public void setmedia(int i){
        this.Array_notas[i][2] = (this.Array_notas[i][0] + this.Array_notas[i][1])/2;
        this.indicador = i;
        if(this.Array_notas[i][2] >= 7){
	            this.alunos_resultado[i][1] = "Aprovado";
	        }
	        else{
	            this.alunos_resultado[i][1] = "Reprovado";
	        }
    }
    
    public float getmedia(){
        return this.Array_notas[this.indicador][2];
    }
    public String getresul(){
        return this.alunos_resultado[this.indicador][1];
    }
    
    public void status(){
        while(true){
	        System.out.println("\nNome:" + this.alunos_resultado[j][0]+", N1:" + this.Array_notas[j][0]+", N2:"+ this.Array_notas[j][1] + ", M:" + this.Array_notas[j][2] + ", Situação:" + this.alunos_resultado[j][1]);
            j += 1;
            if(this.alunos_resultado[j][0] == null)
                break;
	    }
    }
}

