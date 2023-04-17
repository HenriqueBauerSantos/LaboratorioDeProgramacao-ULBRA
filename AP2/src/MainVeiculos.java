public class MainVeiculos {
    public static void main(String[] args) {
        // Instanciar os 3:
        automovel automovel= new automovel();
        motocicleta moto = new motocicleta();
        onibus bus = new onibus();
        //Auto:
        automovel.ligar();
        System.out.println(automovel.isLigado());
        automovel.desligar();
        System.out.println(automovel.isLigado());
        //Moto:
        moto.ligar();
        System.out.println(moto.isLigado());
        moto.desligar();
        System.out.println(moto.isLigado());
        //Bus:
        bus.ligar();
        System.out.println(bus.isLigado());
        bus.desligar();
        System.out.println(bus.isLigado());




    }
}
