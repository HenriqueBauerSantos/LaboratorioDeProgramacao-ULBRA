public class Exerc01 {
    public static void main(String[] args) {
        double[] numeros = new double[3];
        int i=0;
        double soma=0;
        do {
            int numero = (int) (Math.random()* 6);
            numeros[i]=(numero+1);
            i++;
        }while (i<3);
        i=0;
        System.out.println("Os números sortiados foram:");
        do {
            System.out.println(numeros[i]);
            soma = (soma+numeros[i]);
            i++;
        }while (i<3);
        System.out.println("A soma deles : "+soma);
    }
}
