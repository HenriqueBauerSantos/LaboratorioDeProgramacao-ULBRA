import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {
        double preco=1;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Digite o valor do produto:");
            System.out.println("( 0 para encerrar o sistema)");
            preco= scan.nextDouble();
            preco= (preco*1.12);
            System.out.println("O preco reajustado e: "+preco);
        }while (preco != 0);
    }
}
