public class exerc03 {
    public static void main(String[] args){
        int i=0;
        int[] num;
        num = new int[15];
        num[0]=0;
        num[1]=1;
        num[2]=1;
        i=3;
        do {
            num[i]=num[i-1]+num[i-2];
            i++;
        }while (i<15);
        i=0;
        do {
            System.out.println("Item "+(i+1)+"º: "+num[i]);
            i++;
        }while (i<15);
    }

}
