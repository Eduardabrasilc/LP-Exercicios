import java.util.ArrayList;
import java.util.List;

public class ExemploMetodos {
    public static void main(String[] args) {

        Utilitaria utilitaria = new Utilitaria();
//        utilitaria.exibirMensagem();
//        utilitaria.somar(5,7);
//
//        Integer resultado = utilitaria.somar(7,9);
//        System.out.println(resultado);
//
//


        List<String> frutas = new ArrayList<>();
        frutas.add("Goiaba");
        frutas.add("Moraisgo");
        frutas.add("Carambola");
        frutas.add("Uva");

        System.out.println("Frutas: ");
        for (Integer i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }

        System.out.println();

        String frutaPesquisada = "Moraisgo";

    }
}

