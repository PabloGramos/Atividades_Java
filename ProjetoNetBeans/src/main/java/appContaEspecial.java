public class appContaEspecial {

public static void main(String[] args) {

//Aplicativo que irá manipular objetos do tipo ContaEspecial

ContaEspecial e1;

Pessoa p1 = new Pessoa("Carlos", "carlos@gmail.com");

e1 = new ContaEspecial(123456,p1,500,-1000);

System.out.println("O saldo da conta é: " + e1.getSaldo());

System.out.println("O limite da conta é: " + e1.getLimite());

if (e1.sacar(200))

System.out.println("Operação de saque realizada com sucesso.");

else

System.out.println("Limite insuficiente para realização do saque. ");

System.out.println("O saldo atual da conta é: " + e1.getSaldo());

}

}