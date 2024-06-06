import java.util.List;

public class Utilitaria {

//    para começar o metodo você deve utilizar o retorno da primeira função (void é sem retorno)
    //Metodo -> isolar a lógica em diferentes classes
    void exibirMensagem(){
        System.out.println("Olá Mundo!");
    }

    Integer somar(Integer numero1, Integer numero2) {
        return numero1 + numero2;
    }

    void exibirLista(List<String> lista){
        for (Integer i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

}
