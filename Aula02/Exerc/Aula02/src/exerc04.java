import java.util.Scanner;

public class exerc04 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Digite o primeiro numero:");
        num1= sc.nextInt();
        System.out.println("Digite o segundo numero:");
        num2=sc.nextInt();
        soma=(num1+num2);
        System.out.println("A soma e: "+soma);
    }
}
