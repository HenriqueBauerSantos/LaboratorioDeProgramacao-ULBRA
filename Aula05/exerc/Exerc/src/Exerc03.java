import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i< vetorA.length;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            vetorA[i]= scan.nextInt();
        }
        for (int i=0; i< vetorA.length;i++){
            vetorB[i]=(vetorA[i]*vetorA[i]);
        }
        for (int i=0;i< vetorA.length;i++){
            System.out.println("Posicao "+(i+1)+" do vetor A: "+vetorA[i]);
            System.out.println("Posicao "+(i+1)+" do vetor B: "+vetorB[i]);
        }
    }
}
