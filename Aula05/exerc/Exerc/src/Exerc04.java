import java.util.Scanner;

public class Exerc04 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double[] vetorA = new double[15];
        double[] vetorB = new double[vetorA.length];

        for (int i=0; i< vetorA.length;i++){
            System.out.println("Digite o "+(i+1)+" numero:");
            vetorA[i]= scan.nextInt();
        }
        for (int i=0; i< vetorA.length;i++){
            vetorB[i]= Math.sqrt(vetorA[i]);
        }
        for (int i=0;i< vetorA.length;i++){
            System.out.println("Posicao "+(i+1)+" do vetor A: "+vetorA[i]);
            System.out.println("Posicao "+(i+1)+" do vetor B: "+vetorB[i]);
        }
    }
}
