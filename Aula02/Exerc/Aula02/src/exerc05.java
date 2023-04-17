import java.util.Scanner;

public class exerc05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double dist, comb, cons;
        System.out.println("Calculo de consumo medio:");
        System.out.println("Digite a distancia percorrida:");
        dist= sc.nextDouble();
        System.out.println("Digite o combustivel gasto:");
        comb= sc.nextDouble();
        cons= (dist/comb);
        System.out.println("O consumo medio foi de: "+cons);

    }
}
