public class motocicleta extends veiculo{
    public String isLigado(){
        String a = super.isLigado();
        if (a == "ligado"){
            String b = "A motociclita esta ligada";
            return b;

        }
        if (a == "desligado"){
            String b = "A motociclita esta desligada";
            return b;
        }
        return null;
    }
}
