public class exemplo02 {
    public static void main(String[] args) {
        String[] tipo ={"Extra forte","Forte","Suave","Descafeinado"};
        String busca= "Suave";

        for (String cafe: tipo){
            if (busca.equals(cafe)){
                System.out.println("Valor encontrado");
            }
        }
    }
}
