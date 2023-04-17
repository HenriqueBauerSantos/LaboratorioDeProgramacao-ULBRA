import java.util.Scanner;

public class exerc06 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String nome;
        double salaFixo, vendas,comissao, salaFinal;
        System.out.println("Digite o nome do funcionario:");
        nome= sc.nextLine();
        System.out.println("Digite o salario fixo:");
        salaFixo= sc.nextDouble();
        System.out.println("Digite o total de vendas do mes:");
        vendas= sc.nextDouble();
        comissao=(0.15*vendas);
        salaFinal=(salaFixo+comissao);
        System.out.println("Dados:");
        System.out.println("Nome do funcionario: "+nome);
        System.out.println("Salario fixo: "+salaFixo);
        System.out.println("Salario final do mes: "+salaFinal);
    }
}