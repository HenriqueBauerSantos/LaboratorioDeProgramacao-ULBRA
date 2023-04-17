import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha a funcao desejada:");
        System.out.println("1- Contar de 1 a 10;\n2- Contar até a o numero selecionado:\n3- Contrar entre os numeros selecionados;\n4- Contrar entre os numeros selecionados com inervalo de segundos selecionado;");
        int selecao=0, fim, inicio, pausa;
        selecao = scan.nextInt();
        Contagem classeContagem = new Contagem();
        if (selecao==1){
            classeContagem.contar();
        }
        else if (selecao==2) {
            System.out.println("Digite o numero final:");
            fim= scan.nextInt();
            classeContagem.contar(fim);
        }
        else if (selecao==3) {
            System.out.println("Digite o numero inicial:");
            inicio= scan.nextInt();
            System.out.println("Digite o numero final:");
            fim= scan.nextInt();
            classeContagem.contar(inicio,fim);
        }
        else if (selecao==4) {
            System.out.println("Digite o numero inicial:");
            inicio= scan.nextInt();
            System.out.println("Digite o numero final:");
            fim= scan.nextInt();
            System.out.println("Digite o intervalo de tempo entre os numeros:");
            pausa= scan.nextInt();
            classeContagem.contar(inicio,fim,pausa);
        }
        else{
            System.out.println("Opcao invalida!");
        }
    }
}
