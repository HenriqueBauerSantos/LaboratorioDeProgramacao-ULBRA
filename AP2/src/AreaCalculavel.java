 public interface AreaCalculavel {
    double calcularArea();
}
 class Retangulo implements AreaCalculavel {
    public int altura;
    public int largura;

    public Retangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }
    public double calcularArea() {
        return this.altura * this.largura;
    }
 }
 class Quadrado implements AreaCalculavel{
    public int lado;
    public Quadrado(int lado){
        this.lado=lado;
    }
    public double calcularArea(){
        return this.lado * this.lado;
    }
 }
 class Circunferencia implements AreaCalculavel{
    public int raio;
    public Circunferencia(int raio){
        this.raio = raio;
    }
    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
 }

