public class veiculo {
    private  boolean ligado ;

    public void ligar(){
        this.ligado = true;
    };
    public void desligar(){
        this.ligado = false;
    };
    public String isLigado(){
        boolean a = this.ligado;
        if(a == true){
            String b = "ligado";
            return b;
        }
        if (a == false){
            String b = "desligado";
            return b;
        }
        return null;
    }

}
