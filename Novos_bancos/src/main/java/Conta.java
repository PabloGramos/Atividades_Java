public class Conta {

private int numero;

private Pessoa correntista;

private float saldo;

public Conta(){

}

//sobrecarga do construtor de conta

public Conta(int numero, Pessoa correntista, float saldo){

this.setNumero(numero);

this.setCorrentista(correntista);

this.setSaldo(saldo);

}

public void setNumero(int numero) {

this.numero=numero;

}

public int getNumero(){

return this.numero;

}

public void setCorrentista(Pessoa correntista) {

this.correntista=correntista;

}

public Pessoa getCorrentista(){

return this.correntista;

}

public void setSaldo(float saldo) {

this.saldo=saldo;

}

public float getSaldo(){

return this.saldo;

}

//realizar depósitos na conta e atualizar o saldo da conta

public void depositar(float valor) { //recebe um argumento que é o valor float que será depositado

//atualiza o saldo que tem na conta + o novo valor através do método setSaldo

this.setSaldo(this.getSaldo()+valor);

}

//sacar na conta

public boolean sacar(float valor) {

//verificar se tem saldo suficiente

if(this.getSaldo() >= valor){

this.setSaldo(this.getSaldo() - valor);

return true;

}

return false;

}

}