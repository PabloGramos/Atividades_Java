public class Main
{
    public static void main(String[] args){ //M�todo main (principal)
//Aplicativo que ir� manipular objetos do tipo conta
        Conta c1;
//Instanciar o objeto c1 invocando o new Conta (construtor padr�o)
        c1 = new Conta(); //alocando um espa�o na mem�ria de trabalho do computador
//para que seja referenciado os dados desse objeto c1.
//Preencher os dados de c1
//preencher os valores dos atributos da classe - instanciar o objeto - usa set
        c1.setCorrentista("Pedro");
        c1.setNumero(12345);
        c1.setValor(2000);
//mostrar para o usu�rio os valores previamente armazenados
//para obter os dados usamos o m�todo get
        System.out.println("O nome do correntista �: " + c1.getCorrentista());
        System.out.println("O n�mero da conta �: " + c1.getNumero());
        System.out.println("O valor inicial da conta �: " + c1.getValor());
    }
}