public class Main
{
    public static void main(String[] args){ //Método main (principal)
//Aplicativo que irá manipular objetos do tipo conta
        Conta c1;
//Instanciar o objeto c1 invocando o new Conta (construtor padrão)
        c1 = new Conta(); //alocando um espaço na memória de trabalho do computador
//para que seja referenciado os dados desse objeto c1.
//Preencher os dados de c1
//preencher os valores dos atributos da classe - instanciar o objeto - usa set
        c1.setCorrentista("Pedro");
        c1.setNumero(12345);
        c1.setValor(2000);
//mostrar para o usuário os valores previamente armazenados
//para obter os dados usamos o método get
        System.out.println("O nome do correntista é: " + c1.getCorrentista());
        System.out.println("O número da conta é: " + c1.getNumero());
        System.out.println("O valor inicial da conta é: " + c1.getValor());
    }
}