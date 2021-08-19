
import java.util.Scanner;
public class Alunos_e_notas{
    public static void main(String[] args) {
        Scanner leiaS = new Scanner(System.in);
        Scanner leiaF = new Scanner(System.in);
        String[] alunos = new String[10];
        float[] notas = new float[10];
        int j=1;
        float mediador=0, media=0;
        for(int i = 0 ; i <= 9 ; i++){
            System.out.print("\nNome do aluno "+j+": ");
            alunos[i] = leiaS.nextLine();
            System.out.print("Nota do aluno "+j+": ");
            mediador = leiaF.nextFloat();
            notas[i] = mediador;
            media = media + mediador;
            j += 1;
        }
        media = media/10;
        System.out.println("\nA média da turma é " + media);
        System.out.println("\nAlunos acima da média:");
        for (int x=0; x <= 9; x++){
            if(notas[x] > media){
                System.out.println(alunos[x]);
            }
        } 
        
        
    }
}