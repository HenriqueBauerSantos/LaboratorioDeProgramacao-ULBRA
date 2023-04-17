public class Contagem{
    public void contar() {
        int variavel=1;
        for (int i=1; i<=10;i++) {
            System.out.println(variavel);
            variavel++;
        }
    }
    public void contar(int fim){
        int i=0;
        do {
            System.out.println(i+1);
            i++;
        }while (i<fim);
    }
    public void contar(int inicio,int fim){
        int i=inicio;
        do {
            System.out.println(i);
            i++;
        }while (i<=fim);
    }
    public void contar(int inicio,int fim,int pausa){
        int i=inicio;
        int tempo= (pausa*1000);
        do {
            System.out.println(i);
            try{
                Thread.sleep(tempo);
            }catch (Exception erro){}
            i++;
        }while (i<=fim);
    }
}
