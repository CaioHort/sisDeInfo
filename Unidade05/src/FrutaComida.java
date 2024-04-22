public class FrutaComida {
    public static void main(String[] args) throws Exception {

        String comida = "pizza";
        String fruta = "morango";

        boolean vazioComida = comida.isEmpty();
        boolean vazioFruta = fruta.isEmpty();

        if (vazioComida == true && vazioFruta == true) {
            System.out.println("Nao é possivel informar os dados");
            System.out.println("Vazio");
            
        } else if (vazioComida == false && vazioFruta == false) {
            System.out.println("comida: " + comida);
            System.out.println("fruta: " + fruta);

        } else if (vazioComida == false && vazioFruta == true) {
            System.out.println("comida: " + comida);
            System.out.println("Fruta Vazio");
            
        }

        System.out.println("FIM");
    }
}
