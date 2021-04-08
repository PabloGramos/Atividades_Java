public class Conta{
//cria��o dos atributos privates.
    private int numero;
    private String correntista;
    private float valor;
//Todo m�todo construtor precisa ser p�blico para permitir acesso externo
//por outras classes em java e aplica��es. N�o tem nenhum retorno nem mesmo void.
//E tem mesmo nome da classe (incluse a primeira letra mai�sculo)
//Criar o m�todo construtor que vai ser utilizado no momento que
//se criar objetos do tipo conta
//Construtor padr�o - quando invocado na cria��o de um objeto inicializa
//todos os atributos da classe com zero e n�o tem nehum corpo, ou seja,
//n�o tem nenhum c�digo que vai realizar.
    public Conta(){
    }
//Criar os m�todos de acesso publicos aos atributos privates
//Os m�todos de acesso s�o denominados de get e set
//Para cada atributo que foi criado tem que prover um ambiente set
//Set-m�todo que permite que altere o valor de atributo, n�o retorna nenhum valor
//Receber o valor na vari�vel denominada numero
//que vai ser o valor correspondente que o us�rio vai passar(digitar) na
//chamada do m�todo para esse atributo n�mero da classe conta
//this identifica uma estrutura (elemento), descrito no pr�prio interior da classe
    public void setNumero(int numero) {
        this.numero=numero; //recebe o valor que estamos passando
//como argumento para o m�todo set
    }
//Get - retorna o valor de um determinado atributo
//Define-se o tipo de retorno do m�todo que ser� realizado
//neste caso ser� o inteiro representando o atributo n�mero da classe conta
    public int getNumero(){
        return this.numero; //retorna o valor do atributo n�mero da classe conta
    }
    public void setCorrentista(String correntista) {
        this.correntista=correntista;
    }
    public String getCorrentista(){
        return this.correntista;
    }
    public void setValor(float valor) {
        this.valor=valor;
    }
    public float getValor(){
        return this.valor;
    }
}