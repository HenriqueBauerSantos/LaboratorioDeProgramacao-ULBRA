public class Programa {
    public static void main(String[] args) {
        //Definir a primeira fracao
        Fracao f1= new Fracao();
        f1.definirValores(5,2);
        //Definir a segunda fracao
        Fracao f2 = new Fracao();
        f2.definirValores(1,7);
        //Multiplicar as fracoes e obter o resultado
        Fracao f3 = f1.multiplicar(f2);
        //Mostra fracao
        System.out.println(f3.obterFracao());
        //Mostrar o valor da fracao
        System.out.println(f3.calcularValor());
    }
}
