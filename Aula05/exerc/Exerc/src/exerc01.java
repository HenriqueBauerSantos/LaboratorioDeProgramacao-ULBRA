import java.util.Scanner;

public class exerc01 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i < vetorA.length; i++){
            System.out.println("Entre com o "+ (i+1)+"º valor:");
            vetorA[i] = scan.nextInt();
        };
        for (int i=0; i< vetorA.length;i++){
            vetorB[i]= vetorA[i];
        }
        for (int i=0; i< vetorA.length;i++){
            System.out.println((i+1)+"º posicao do vetor A:"+vetorA[i]);
            System.out.println((i+1)+"º posicao do vetor B:"+vetorB[i]);
        }
    };
}
