import java.util.Scanner;

public class exerc08 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a,b,c;
        System.out.println("Digite o valor de A:");
        a= sc.nextInt();
        System.out.println("Digite o valor de B:");
        b= sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Os valores foram invertidos, agora sao estes:");
        System.out.println("A tem o valor de: "+a);
        System.out.println("B tem o valor de: "+b);

    }
}
