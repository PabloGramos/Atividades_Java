//Especialização de conta

public class ContaEspecial extends Conta{ //herda todas as características e funcionalidades

private float limite;

public ContaEspecial(){

}

//inicializa os atributos de ContaEspecial e de Conta

public ContaEspecial(int numero, Pessoa correntista, float valor, float limite){

//chamar os métodos da classe genérica Conta

super(numero,correntista,valor);

//this.limite = limite;

this.setLimite(limite);

}

public float getLimite(){

return limite;

}

public void setLimite(float limite) {

this.limite=limite;

}

//Identificar no código que ContaEspecial que herda de Conta e tem um comportamento distinto no método sacar.

@Override

//mudar o comportamento do método sacar – implementando polimorfismo (usado em classes especializadas)

public boolean sacar(float valor){

if(this.getSaldo() - valor >= this.getLimite()){

this.setSaldo(this.getSaldo() - valor);

return true;

}

return false;

}

} 