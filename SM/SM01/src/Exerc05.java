import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite a frase: ");
        String frase = new String();
        frase= tc.next();
        System.out.println(frase);
        String busca = "sexo";
        String busca2= "sexual";
        for (int i=0; i<frase.length();i++){
            if (busca.equals(frase) || busca2.equals(frase)){
                System.out.println("Conteúdo improprio.");
            }
            else {
                System.out.println("Conteúdo liberado");
            }
        }
    }
}
