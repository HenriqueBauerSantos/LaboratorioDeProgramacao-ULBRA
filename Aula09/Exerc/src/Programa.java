import java.util.Scanner;
 class Programa {
    public static void main(String[] args) {
        int opcao;
        Scanner sc= new Scanner(System.in);
        System.out.println("Selecione uma opcao para calcular a area:");
        System.out.println("1- Triangulo;\n2- Quadrado;\n3- Circunferencia;\n4- Trapezio;");
        opcao = sc.nextInt();
        if (opcao==1){
            double base,altura;
            System.out.println("Digite o valor da base do triangulo:");
            base= sc.nextDouble();
            System.out.println("Digite o valor da altura do triangulo:");
            altura= sc.nextDouble();
            Triangulo T1 = new Triangulo();
            System.out.println(T1.calcularArea(base,altura));
        }
        else if (opcao==2){
            double lado;
            System.out.println("Digite o valor do lado do Quadrado:");
            lado= sc.nextDouble();
            Quadrado Q1 = new Quadrado();
            System.out.println(Q1.calcularArea(lado));
        }
        else if (opcao==3){
            double raio;
            System.out.println("Digite o valor do raio da circunferencia:");
            raio= sc.nextDouble();
            Circunferencia C1 = new Circunferencia();
            System.out.println(C1.calcularArea(raio));
        }
        else if (opcao==4){
            double bMaior,bMenor,altura;
            System.out.println("Digite o valor da base maior do trapezio:");
            bMaior= sc.nextDouble();
            System.out.println("Digite o valor da base menor do trapezio:");
            bMenor= sc.nextDouble();
            System.out.println("Digite o valor da altura do trapezio:");
            altura= sc.nextDouble();
            Trapezio TR1 = new Trapezio();
            System.out.println(TR1.calcularArea(bMaior,bMenor,altura));
        }
        else {
            System.out.println("Opcao invalida.");
        }
    }
}
