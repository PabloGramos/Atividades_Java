public class Conta{
//criação dos atributos privates.
    private int numero;
    private String correntista;
    private float valor;
//Todo método construtor precisa ser público para permitir acesso externo
//por outras classes em java e aplicações. Não tem nenhum retorno nem mesmo void.
//E tem mesmo nome da classe (incluse a primeira letra maiúsculo)
//Criar o método construtor que vai ser utilizado no momento que
//se criar objetos do tipo conta
//Construtor padrão - quando invocado na criação de um objeto inicializa
//todos os atributos da classe com zero e não tem nehum corpo, ou seja,
//não tem nenhum código que vai realizar.
    public Conta(){
    }
//Criar os métodos de acesso publicos aos atributos privates
//Os métodos de acesso são denominados de get e set
//Para cada atributo que foi criado tem que prover um ambiente set
//Set-método que permite que altere o valor de atributo, não retorna nenhum valor
//Receber o valor na variável denominada numero
//que vai ser o valor correspondente que o usário vai passar(digitar) na
//chamada do método para esse atributo número da classe conta
//this identifica uma estrutura (elemento), descrito no próprio interior da classe
    public void setNumero(int numero) {
        this.numero=numero; //recebe o valor que estamos passando
//como argumento para o método set
    }
//Get - retorna o valor de um determinado atributo
//Define-se o tipo de retorno do método que será realizado
//neste caso será o inteiro representando o atributo número da classe conta
    public int getNumero(){
        return this.numero; //retorna o valor do atributo número da classe conta
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