public class MainArea  {
    public static void main(String[] args) {
        AreaCalculavel retangulo1 = new Retangulo(3,2);
        System.out.println("Area do retangulo: "+retangulo1.calcularArea());

        AreaCalculavel Quadrado1 = new Quadrado(2);
        System.out.println("Area do quadrado:" + Quadrado1.calcularArea());

        AreaCalculavel Circulo1 = new Circunferencia(6);
        System.out.println("Area do Cirulo:" + Circulo1.calcularArea());
    }
}
