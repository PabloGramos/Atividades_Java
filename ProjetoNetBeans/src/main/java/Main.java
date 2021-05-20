import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Produto pd = new Produto();
        Descrever dc = new Descrever();
        int verifica;
        
        System.out.print("Código: ");
        dc.setCodigo(entrada.nextInt());
        System.out.print("Descrição: ");
        dc.setDescricao(entrada.nextLine());
        System.out.println("Quantidade mínima desejada: ");
        verifica = entrada.nextInt();
        if(verifica < 0){
            System.out.println("Quantidade não pode ser negativo! ");
            System.exit(0);
        }
        else{
            pd.setreporEstoque(verifica);
        }
        pd.setAssocia(dc);
        while(true){
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
        
        System.out.println("Código: " + pd.getAssocia().getCodigo());
        
        System.out.println("Descrição: " + pd.getAssocia().getDescricao());
        
    }
    
}
