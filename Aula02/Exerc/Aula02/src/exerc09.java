import java.util.Scanner;

public class exerc09 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double valor, prestacao;
        int  parcelas;
        System.out.println("Digite o valor da compra:");
        valor= sc.nextDouble();
        System.out.println("Quantas parcelas:");
        parcelas= sc.nextInt();
        prestacao=(valor/parcelas);
        System.out.println("Sao "+parcelas+" parcelas de "+prestacao+" reais.");
    }
}
