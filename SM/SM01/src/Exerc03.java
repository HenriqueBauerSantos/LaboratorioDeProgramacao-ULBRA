public class Exerc03 {
    public static void main(String[] args) {
        int numeroAle = (int) (Math.random()*5);
        System.out.println(numeroAle);
        int numero = numeroAle+5;
        int[] senha = new int[numero];
        for (int i=0; i<numero; i++){
            senha[i]= (int) (Math.random()*10);
        }
        System.out.println("Digitos da senha: ");
        for (int i=0; i< senha.length; i ++){
            System.out.println(senha[i]);
        }
    }
}
