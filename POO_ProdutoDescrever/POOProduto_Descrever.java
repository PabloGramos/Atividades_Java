import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaDesc = new Scanner(System.in);
        Scanner entradaFloat = new Scanner(System.in);
        
        Produto pd = new Produto();
        Descrever dc = new Descrever();
        int opcao;
        float verifica;
        System.out.print("Código: ");
        dc.setCodigo(entrada.nextInt());
        System.out.print("Descrição: ");
        dc.setDescricao(entradaDesc.nextLine());
        System.out.println("Quantidade mínima desejada: ");
        verifica = entradaFloat.nextFloat();
        if(verifica < 0){
            System.out.println("Quantidade não pode ser negativo! ");
            System.exit(0);
        }
        else if(verifica > pd.getquantidadeDisponivel()){
            System.out.println("Estoque insuficiente!");
            System.exit(0);
        }
        else{
            pd.setQuantidadePedida(verifica);
        }
        pd.setAssocia(dc);
        while(true){
            System.out.println("\n1-Registro da Compra");
            System.out.println("2-Alterar Preço Venda");
            System.out.println("3-Registro da Venda");
            System.out.println("4-Verificar Reposição");
            System.out.println("5-Fim");
            System.out.print("==>");
            opcao = entrada.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("===================================");
                    System.out.println("\nProduto: " + pd.getAssocia().getCodigo());
                    System.out.println("Descrição: " + pd.getAssocia().getDescricao());
                    System.out.println("Valor unitário: " + pd.getalterarPreco());
                    System.out.println("Valor total: " + pd.getvalorTotal());
                    System.out.println("===================================");
                    break;
                case 2:
                    System.out.println("===================================");
                    System.out.print("\nNovo preço: ");
                    pd.setalterarPreco(entradaFloat.nextFloat());
                    System.out.println("===================================");
                    break;
                case 3:
                    pd.registroVenda();
                    break;
                case 4:
                    System.out.println("===================================");
                    System.out.println(pd.getprecisaRepor());
                    System.out.print("Repor estoque?(0-S/1-N) ");
                    if(entrada.nextInt() == 0)
                        pd.reporEstoque();
                    System.out.println("===================================");
                    break;
                case 5:
                    System.exit(0);
                default:
                System.out.println("Operacao Invalida!!!");
                break;
            }
        }
        
    }
    
}
