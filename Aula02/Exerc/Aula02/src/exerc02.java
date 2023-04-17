public class exerc02 {
    public static void main(String[] args){
        int i=10,soma=0,resu=0;
        do {
            System.out.println(i);
            i++;
        }while(i<=25);
        i=1;
        do {
            if (i%2!=0){
                soma=soma+i;
            }
            i++;
        }while (i<100);
        System.out.println("A soma e: "+soma);
        i=0;
        soma=0;
        do {
            System.out.println(i);
            soma=soma+i;
            i++;
        }while (soma<100);
        i=0;
        do {
            resu=i*9;
            System.out.println(i+"x9= "+resu);
            i++;
        }while (i<11);
    }
}
