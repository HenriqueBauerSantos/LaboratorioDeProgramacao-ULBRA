public class automovel extends veiculo{
    public String isLigado(){
        String a = super.isLigado();
        if (a == "ligado"){
            String b = "O automovel esta ligado";
            return b;

        }
        if (a == "desligado"){
            String b = "O automovel esta desligado";
            return b;
        }
        return null;
    }
}
