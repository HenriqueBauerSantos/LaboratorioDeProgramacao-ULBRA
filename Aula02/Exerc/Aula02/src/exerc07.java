import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String nome;
        double nota1, nota2, nota3, media;
        System.out.println("Digite o nome do aluno:");
        nome= sc.nextLine();
        System.out.println("Digite a primeira nota:");
        nota1= sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2= sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3= sc.nextDouble();
        media=((nota1+nota2+nota3)/3);
        System.out.println("O aluno "+nome+" tirou a media: "+media);
    }
}
