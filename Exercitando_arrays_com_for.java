import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner leituraF = new Scanner(System.in);
	    Scanner leituraS = new Scanner(System.in);
	    float vet_altura[] = new float[10], altura=0, menor=5, maior=0, mediaF=0, mediaM=0;
	    String vet_sexo[] = new String[10], sexo;
	    int iden_ma=0, iden_me=0, num_m=0, num_f=0;
	    
	    for(int i=0; i<10; i++){
	        System.out.print("\nDigite a altura do "+(i+1)+" indivíduo: ");
	        altura = leituraF.nextFloat();
	        vet_altura[i] = altura;
	        System.out.print("Digite o sexo do "+(i+1)+" indivíduo(M/F): ");
	        sexo = leituraS.nextLine();
	        vet_sexo[i] = sexo;
	   }
	    for(int j=0; j<10; j++){
	        if(vet_altura[j] > maior){
	            maior = vet_altura[j];
	            iden_ma = j;
	        }
	        if(vet_altura[j] < menor){
	            menor = vet_altura[j];
	            iden_me = j;
	        }
	    }
	    
	    for(int x=0; x<10; x++){
	        if (vet_sexo[x].equals("M")){
	            mediaM = mediaM + vet_altura[x];
	            num_m += 1;
	        }
	        else{
	            mediaF = mediaF + vet_altura[x];
	            num_f += 1;
	        }
	    }
	    mediaM = mediaM / num_m;
	    mediaF = mediaF / num_f;
	    
	    System.out.println("\nO indivíduo de maior altura com " + maior + " metros é de sexo " + vet_sexo[iden_ma]);
	    System.out.println("O indivíduo de menor altura com " + menor + " metros é de sexo " + vet_sexo[iden_me]);
	    
	    System.out.println("\nA média da altura entre os indivíduos de sexo masculino é " + mediaM);
	    System.out.println("A média da altura entre os indivíduos de sexo feminino é " + mediaF);
	    
	    System.out.println("\nO total de indivíduos de sexo masculino é " + num_m);
	    System.out.println("O total de indivíduos de sexo feminino é " + num_f);
	}
}