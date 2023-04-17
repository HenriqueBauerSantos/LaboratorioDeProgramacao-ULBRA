public class onibus extends veiculo{
    public String isLigado(){
        String a = super.isLigado();
        if (a == "ligado"){
            String b = "O onibus esta ligado";
            return b;

        }
        if (a == "desligado"){
            String b = "O onibus esta desligado";
            return b;
        }
        return null;
    }
}
