import java.text.DecimalFormat;

public class ExCeil {
    public static void main(String[] args){
        System.out.println("Arredondando:");
        System.out.println(Math.ceil(2.2));
        int sorteio= (int) (Math.random()*100);
        System.out.println(sorteio);
        DecimalFormat money = new DecimalFormat();
        double g=121547;
        double h=387;
        money.applyPattern("R$ #,###.00");
        System.out.println(money.format(g));
        System.out.println(money.format(h));
    }
}
