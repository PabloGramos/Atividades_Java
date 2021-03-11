import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random numAl = new Random();
        int num = 0;
        int[][] vetor1 = new int[2][4]; 
        int[][] vetor2 = new int[2][4];
        int[][] vetor3 = new int[2][4];
        
        for(int i = 0;i < 2;i++)
            for(int j = 0; j< 4;j++){
                vetor1[i][j]= numAl.nextInt(100);
                vetor2[i][j] = numAl.nextInt(100);
                vetor3[i][j] = vetor1[i][j] + vetor2[i][j];
            }
        System.out.println("Primeiro vetor...");
        for(int x = 0;x < 2;x++)
            for(int y = 0; y< 4;y++){
                System.out.println("Indice ["+x+"]" +" ["+y+"]: " + vetor1[x][y]);
                
            }
        
        System.out.println("\nSegundo vetor...");
        for(int z = 0;z < 2;z++)
            for(int w = 0; w< 4;w++){
                System.out.println("Indice ["+z+"]" +" ["+w+"]: " + vetor2[z][w]);
                
            }
        
        System.out.println("\nVetor soma...");
        for(int l = 0;l < 2;l++)
            for(int b = 0; b< 4;b++){
                System.out.println("Indice ["+l+"]" +" ["+b+"]: " + vetor3[l][b]);
                
            }
    }
}