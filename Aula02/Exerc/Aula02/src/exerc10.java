import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double custo, venda, percentual;
        System.out.println("Digite o valor de custo do produto:");
        custo= sc.nextDouble();
        System.out.println("Digite o percentual para venda:");
        percentual= sc.nextDouble();
        percentual=(percentual/100);
        percentual=(percentual+1);
        System.out.println("Perc: "+percentual);
        venda=(custo*percentual);
        System.out.println("Preco de venda: "+venda);
    }
}
