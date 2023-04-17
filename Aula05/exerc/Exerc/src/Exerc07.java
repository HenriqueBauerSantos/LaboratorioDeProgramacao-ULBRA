import java.util.Scanner;

public class Exerc07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[vetorA.length];

        for (int i=0; i< vetorA.length;i++){
            System.out.println("Digite o "+(i+1)+" numero do vetor A:");
            vetorA[i]= scan.nextInt();
        }
        for (int i=0; i< vetorA.length;i++){
            System.out.println("Digite o "+(i+1)+" numero do vetor B:");
            vetorB[i]= scan.nextInt();
        }
        for (int i=0; i< vetorA.length;i++){
            vetorC[i]=(vetorA[i]-vetorB[i]);
        }
        for (int i=0;i< vetorA.length;i++){
            System.out.println("Posicao "+(i+1)+" do vetor C: "+vetorC[i]);
        }
    }
}
